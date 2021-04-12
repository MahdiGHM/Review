package com.mahdigh.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/9/2021
 */

@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 8431824622814538913L;

    @Id
    @Column(name = "product_id")
    @SequenceGenerator(name = "product_id_generator", sequenceName = "product_sequence_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_generator")
    private Long id;

    private String name;

    private Integer code;

    @Column(length = 1000)
    private String details;

    @Column(length = 2000)
    private String picture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_id")
    private Provider provider;

    private Boolean enabled = true;

    @Column(name = "enabled_comment")
    private Boolean enabledComment = true;

    @Column(name = "enabled_public_comment")
    private Boolean enabledPublicComment = false;

    @Column(name = "enabled_vote")
    private Boolean enabledVote = true;

    @Column(name = "enabled_public_vote")
    private Boolean enabledPublicVote = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabledComment() {
        return enabledComment;
    }

    public void setEnabledComment(Boolean enabledComment) {
        this.enabledComment = enabledComment;
    }

    public Boolean getEnabledPublicComment() {
        return enabledPublicComment;
    }

    public void setEnabledPublicComment(Boolean enabledPublicComment) {
        this.enabledPublicComment = enabledPublicComment;
    }

    public Boolean getEnabledVote() {
        return enabledVote;
    }

    public void setEnabledVote(Boolean enabledVote) {
        this.enabledVote = enabledVote;
    }

    public Boolean getEnabledPublicVote() {
        return enabledPublicVote;
    }

    public void setEnabledPublicVote(Boolean enabledPublicVote) {
        this.enabledPublicVote = enabledPublicVote;
    }
}
