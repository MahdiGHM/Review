package com.mahdigh.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

@Entity
@Table(name = "category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1422224622814538990L;

    @Id
    @Column(name = "category_id")
    @SequenceGenerator(name = "category_id_generator", sequenceName = "category_sequence_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_id_generator")
    private Long id;

    private String name;

    private Integer code;

    @Column(length = 1000)
    private String details;

    @Column(length = 2000)
    private String picture;

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
}
