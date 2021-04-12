package com.mahdigh.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

@Entity
@Table(name = "normal_user_purchase_history")
public class NormalUserPurchaseHistory extends AuditProvider implements Serializable {

    private static final long serialVersionUID = 7461825620814538922L;

    @Id
    @Column(name = "normal_user_purchase_history_id")
    @SequenceGenerator(name = "normal_user_purchase_history_id_generator", sequenceName = "normal_user_purchase_history_sequence_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "normal_user_purchase_history_id_generator")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private NormalUser buyer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NormalUser getBuyer() {
        return buyer;
    }

    public void setBuyer(NormalUser buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
