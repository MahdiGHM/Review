package com.mahdigh.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@MappedSuperclass
public class AuditProvider implements Serializable {

    private static final long serialVersionUID = 7461825620814538922L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private NormalUser owner;

    @Column(name = "create_date_time", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime createDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "last_editor_id")
    private NormalUser lastEditor;

    @Column(name = "last_edit_date_time", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime lastEditDateTime;

    @Column(name = "deleted")
    private Boolean deleted = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delete_user_id")
    private NormalUser deleteUser;

    @Column(name = "delete_date_time", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime deleteDateTime;

    public NormalUser getOwner() {
        return owner;
    }

    public void setOwner(NormalUser owner) {
        this.owner = owner;
    }

    public OffsetDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(OffsetDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public NormalUser getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(NormalUser lastEditor) {
        this.lastEditor = lastEditor;
    }

    public OffsetDateTime getLastEditDateTime() {
        return lastEditDateTime;
    }

    public void setLastEditDateTime(OffsetDateTime lastEditDateTime) {
        this.lastEditDateTime = lastEditDateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public NormalUser getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(NormalUser deleteUser) {
        this.deleteUser = deleteUser;
    }

    public OffsetDateTime getDeleteDateTime() {
        return deleteDateTime;
    }

    public void setDeleteDateTime(OffsetDateTime deleteDateTime) {
        this.deleteDateTime = deleteDateTime;
    }
}
