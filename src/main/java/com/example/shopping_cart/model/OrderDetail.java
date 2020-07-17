package com.example.shopping_cart.model;

import javax.persistence.*;

/**
 * Simple JavaBean domain object that represents OrderDetail.
 */

@Entity
@Table(name="orderDetail")
public class OrderDetail {

    public OrderDetail() {}

    public OrderDetail(Long price, Long quantity, Order order, Product product) {
        this.price = price;
        this.quantity = quantity;
        this.order = order;
        this.product = product;
    }

    public OrderDetail(Long id, Long price, Long quantity, Order order, Product product) {
        this(price, quantity, order, product);
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long price;
    private Long quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", updatable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", updatable = false)
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
