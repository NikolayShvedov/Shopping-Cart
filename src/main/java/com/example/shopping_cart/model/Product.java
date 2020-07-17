package com.example.shopping_cart.model;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {

    public Product() {}

    public Product(String name, Long price, String description, Boolean inStock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
    }

    public Product(Long id, String name, Long price, String description, Boolean inStock) {
        this(name, price, description, inStock);
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="names")
    private String name;

    private Long price;
    private String description;
    private Boolean inStock;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }


}
