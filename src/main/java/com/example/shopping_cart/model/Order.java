package com.example.shopping_cart.model;

import com.example.shopping_cart.model.enums.OrderStatus;
import com.example.shopping_cart.model.enums.PaymentMethod;

import javax.persistence.*;

/**
 * Simple JavaBean domain object that represents Order.
 */

@Entity
@Table(name="orders")
public class Order {

    public Order() {}

    public Order(String order_date, OrderStatus order_status, PaymentMethod payment_method, Customer customer) {
        this.order_date = order_date;
        this.order_status = order_status;
        this.payment_method = payment_method;
        this.customer = customer;
    }

    public Order(Long id, String order_date, OrderStatus order_status, PaymentMethod payment_method, Customer customer) {
        this(order_date, order_status, payment_method, customer);
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String order_date;

    @Enumerated(EnumType.STRING)
    private OrderStatus order_status;

    @Enumerated(EnumType.STRING)
    private PaymentMethod payment_method;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", updatable = false)
    private Customer customer;

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
