package com.example.shop_cart.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Simple JavaBean domain object that represents Order.
 */

@Entity
@Table(name="orders")
public class Order {

    public Order() {}

    public Order(String order_date, OrderStatus order_status, PaymentMethod payment_method) {
        this.order_date = order_date;
        this.order_status = order_status;
        this.payment_method = payment_method;
    }

    public Order(Long id, String order_date, OrderStatus order_status, PaymentMethod payment_method) {
        this(order_date, order_status, payment_method);
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // иначе ошибка на отсутствие hibernate_sequence во время вставки
    private Long id;

    @Column(name="order_date")
    private String order_date; //почему строка а не java.util.Date ?

    @Enumerated(EnumType.STRING)
    private OrderStatus order_status; // здесь не набор статусов, а один из них

    @Enumerated(EnumType.STRING)
    private PaymentMethod payment_method; // здесь не набор, а один из

    //todo где ссылка на Customer ?

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public OrderStatus getOrder_status() {
        return order_status;
    }

    public void setOrder_status(OrderStatus order_status) {
        this.order_status = order_status;
    }

    public PaymentMethod getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(PaymentMethod payment_method) {
        this.payment_method = payment_method;
    }
}
