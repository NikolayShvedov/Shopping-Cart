package com.example.shop_cart.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

<<<<<<< HEAD
import javax.persistence.*;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
>>>>>>> 2138dcdd8144f446734598a6b716d955b0e5d1f2

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
<<<<<<< HEAD
    @JoinColumn(name = "product_id", referencedColumnName = "id", updatable = false)
    private Product product;
=======
    @JoinColumn(name = "customer_id", referencedColumnName = "id", updatable = false)
    private Customer customer; // todo здесь вообще-то должна быть ссылка на Product, а не покупателя
>>>>>>> 2138dcdd8144f446734598a6b716d955b0e5d1f2

    public Long getOrderId() {
        return order.getId();
    }
}
