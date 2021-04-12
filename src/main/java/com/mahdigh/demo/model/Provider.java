package com.mahdigh.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/9/2021
 */

@Entity
@Table(name = "provider")
public class Provider implements Serializable {

    private static final long serialVersionUID = 2145565620824538111L;

    @Id
    @Column(name = "provider_id")
    @SequenceGenerator(name = "provider_id_generator", sequenceName = "provider_sequence_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "provider_id_generator")
    private Long id;

    private String name;

    private Integer code;

    @Column(length = 500)
    private String address;

    @Column(length = 20)
    private String phone;

    @Column(length = 2000)
    private String logo;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
