package com.example.shop_cart.model;

import com.example.shop_cart.model.enums.OrderStatus;
import com.example.shop_cart.model.enums.PaymentMethod;

import javax.persistence.*;

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
<<<<<<< HEAD
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="order_date", nullable = false)
    private String order_date;

    @Enumerated(EnumType.STRING)
    @Column(name="order_status", nullable = false, length = 20)
    private OrderStatus order_status;

    @Enumerated(EnumType.STRING)
    @Column(name="payment_method", nullable = false, length = 20)
    private PaymentMethod payment_method;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id", updatable = false)
    private Customer customer;
=======
    @GeneratedValue(strategy=GenerationType.IDENTITY) // иначе ошибка на отсутствие hibernate_sequence во время вставки
    private Long id;

    @Column(name="order_date")
    private String order_date; //почему строка а не java.util.Date ?

    @Enumerated(EnumType.STRING)
    private OrderStatus order_status; // здесь не набор статусов, а один из них

    @Enumerated(EnumType.STRING)
    private PaymentMethod payment_method; // здесь не набор, а один из

    //todo где ссылка на Customer ?
>>>>>>> 2138dcdd8144f446734598a6b716d955b0e5d1f2

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

    public Long getCustomerId() {
        return customer.getId();
    }

    public void setCustomerId(Customer customerId) {
        this.customer = customerId;
    }
}
