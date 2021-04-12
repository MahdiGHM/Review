package com.mahdigh.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/9/2021
 */

@Entity
@Table(name = "normal_user") //named normal user because some of RDBMS reserved 'user' key word
public class NormalUser extends AbstractUser implements Serializable {

    private static final long serialVersionUID = 7461825620814538922L;

    @Id
    @Column(name = "normal_user_id")
    @SequenceGenerator(name = "normal_user_id_generator", sequenceName = "normal_user_sequence_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "normal_user_id_generator")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
