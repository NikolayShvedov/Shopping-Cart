package com.example.shopping_cart.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping_cart.model.Order;
import com.example.shopping_cart.repositories.OrderRepository;
import com.example.shopping_cart.service.OrderService;

@RestController
@RequestMapping("api/base/")
public class OrderRestController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderService orderService;

    private Long counter = 0L;

    private Long generateId() {
        return counter++;
    }

    List<Order> orders;

    @GetMapping("check")
    public String getAllApplication() {
        return "Application Upload Date: " + new Date();
    }

    @GetMapping("orders/getOrder/{id}")
    public Order getOrder(@PathVariable Long id){
        return orderService.getById(id);
    } // show order by id

    @GetMapping("orders")
    public List getAllOrders() {
        return orders;
    } // show orders

    @PostMapping(value = "orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public Order createOrder(@RequestBody Order newOrder) {
        return addOrder(newOrder);
    } //save order

    private Order addOrder(Order order) {
        order.setId(generateId());
        orders.add(order);
        return order;
    }

    @PutMapping(value = "orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public Order changeOrder(@RequestBody Order changingOrder) {
        return updateOrder(changingOrder);
    } // change order

    private Order updateOrder(Order order) {
        if (order.getId()==null)
        {
            throw new RuntimeException("id of changing order cannot be null");
        }
        Order changingOrder = orders.stream()
                .filter(el -> el.getId().equals(order.getId()))
                .findFirst().orElseThrow(() -> new RuntimeException("order with id:" + order.getId() + "not found"));
        changingOrder.setOrder_date(order.getOrder_date());
        changingOrder.setOrder_status(order.getOrder_status());
        changingOrder.setPayment_method(order.getPayment_method());
        changingOrder.setCustomer(order.getCustomer());
        return order;
    }

    @DeleteMapping(value = "orders/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Long deleteOrder(@PathVariable("id")Long id) {
        return remoteOrder(id);
    } // delete order

    private Long remoteOrder(Long id) {
        orders.removeIf(el -> el.getId().equals(id));
        return id;
    }
}
