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

    public Order(String order_date, Set<OrderStatus> order_status, Set<PaymentMethod> payment_method) {
        this.order_date = order_date;
        this.order_status = order_status;
        this.payment_method = payment_method;
    }

    public Order(Long id, String order_date, Set<OrderStatus> order_status, Set<PaymentMethod> payment_method) {
        this(order_date, order_status, payment_method);
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="order_date")
    private String order_date;

    @ElementCollection(targetClass = OrderStatus.class, fetch = FetchType.EAGER)
    @Column(name="order_status")
    @Enumerated(EnumType.STRING)
    private Set<OrderStatus> order_status;

    @ElementCollection(targetClass = PaymentMethod.class, fetch = FetchType.EAGER)
    @Column(name="payment_method")
    @Enumerated(EnumType.STRING)
    private Set<PaymentMethod> payment_method;

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

    public Set<OrderStatus> getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Set<OrderStatus> order_status) {
        this.order_status = order_status;
    }

    public Set<PaymentMethod> getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(Set<PaymentMethod> payment_method) {
        this.payment_method = payment_method;
    }
}
