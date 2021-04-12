package com.mahdigh.demo.dto;

import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 6722224622814538990L;

    private String name;

    private Long id;

    private String picture;

    public CategoryDTO() {
    }

    public CategoryDTO(String name, Long id, String picture) {
        this.name = name;
        this.id = id;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
