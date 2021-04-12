package com.mahdigh.demo.model;

import com.mahdigh.demo.enums.State;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/9/2021
 */

@Entity
@Table(name = "comment")
public class Comment extends AuditProvider implements Serializable {

    private static final long serialVersionUID = 4661835620864538920L;

    @Id
    @Column(name = "comment_id")
    @SequenceGenerator(name = "comment_id_generator", sequenceName = "comment_sequence_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_id_generator")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "writer_id")
    private NormalUser writer;

    @Enumerated(EnumType.STRING)
    @Column(name = "state", length = 20)
    private State state = State.NOT_APPROVED;

    @Column(length = 4000)
    private String content;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NormalUser getWriter() {
        return writer;
    }

    public void setWriter(NormalUser writer) {
        this.writer = writer;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
