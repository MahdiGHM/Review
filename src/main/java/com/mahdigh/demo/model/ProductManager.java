package com.mahdigh.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/9/2021
 */

@Entity
@Table(name = "product_manager")
public class ProductManager extends AbstractUser implements Serializable {

    private static final long serialVersionUID = 6761825640874563128L;

    @Id
    @Column(name = "product_manager_id")
    @SequenceGenerator(name = "product_manager_id_generator", sequenceName = "product_manager_sequence_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_manager_id_generator")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
