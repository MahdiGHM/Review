package com.mahdigh.demo.model;

import com.mahdigh.demo.enums.State;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/9/2021
 */

@Entity
@Table(name = "vote")
public class Vote extends AuditProvider implements Serializable {

    private static final long serialVersionUID = 1624561220864538923L;

    @Id
    @Column(name = "vote_id")
    @SequenceGenerator(name = "vote_id_generator", sequenceName = "vote_sequence_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vote_id_generator")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "writer_id")
    private NormalUser writer;

    @Enumerated(EnumType.STRING)
    @Column(name = "state", length = 20)
    private State state = State.NOT_APPROVED;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer number;

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
