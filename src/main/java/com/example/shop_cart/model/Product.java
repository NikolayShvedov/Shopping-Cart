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

<<<<<<< HEAD
    @Column(name="in_stock", nullable = false)
    private Boolean inStock;;
=======
    @Column(name="in_stock")
    private Boolean inStock; // без подчерков в имени
>>>>>>> 2138dcdd8144f446734598a6b716d955b0e5d1f2
}
