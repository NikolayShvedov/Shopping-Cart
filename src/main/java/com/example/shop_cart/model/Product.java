package com.example.shop_cart.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object that represents Product.
 */

@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
public class Product extends BaseEntity{

    @Column(name="names", nullable = false)
    private String name;

    @Column(name="price", nullable = false)
    private Integer price;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="in_stock", nullable = false)
    private Boolean inStock;;
}
