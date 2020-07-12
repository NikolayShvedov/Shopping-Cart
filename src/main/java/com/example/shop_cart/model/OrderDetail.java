package com.example.shop_cart.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Simple JavaBean domain object that represents OrderDetail.
 */

@Entity
@Table(name = "orderDetail")
@Getter
@Setter
@ToString
public class OrderDetail extends BaseEntity{

    @Column(name="price", nullable = false)
    private Integer price;

    @Column(name="quantity", nullable = false)
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id", updatable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", updatable = false)
    private Product product;

    public Long getOrderId() {
        return order.getId();
    }
}
