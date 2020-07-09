package com.example.shop_cart.model;

import javax.persistence.*;

/**
 * Simple JavaBean domain object that represents Customer.
 */

@Entity
@Table(name="customer")
public class Customer{

    public Customer() {}

    public Customer(String name, String fio, String address, String email, String phone) {
        this.name = name;
        this.fio = fio;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Customer(Long id, String name, String fio, String address, String email, String phone) {
        this(name, fio, address, email, phone);
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="names")
    private String name;

    @Column(name="surname")
    private String fio;

    @Column(name="address")
    private String address;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}