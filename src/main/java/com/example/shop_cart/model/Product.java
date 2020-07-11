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

    @Column(name="names")
    private String name;

    @Column(name="price")
    private Integer price;

    @Column(name="description")
    private String description;

    @Column(name="in_stock")
    private Boolean inStock; // без подчерков в имени
}
