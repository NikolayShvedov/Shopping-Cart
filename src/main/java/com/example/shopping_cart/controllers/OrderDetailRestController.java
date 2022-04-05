package com.example.shopping_cart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping_cart.model.OrderDetail;
import com.example.shopping_cart.repositories.OrderDetailRepository;
import com.example.shopping_cart.service.OrderDetailService;

/**
 * REST controller for {@link OrderDetail} connected requests.
 */

@RestController
@RequestMapping("api/base/")
public class OrderDetailRestController {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderDetailService orderDetailService;

    private Long counter = 0L;

    private Long generateId() {
        return counter++;
    }

    List<OrderDetail> orderDetails;

    @GetMapping("orderDetail/getOrderDetail/{order_id}")
    public List<OrderDetail> getOrderDetail(@PathVariable Long order_id){
        return orderDetailService.getOrderDetailByOrderId(order_id);
    } // show position by order_id

    @PostMapping(value = "orderDetail", produces = MediaType.APPLICATION_JSON_VALUE)
    public OrderDetail createOrderDetail(@RequestBody OrderDetail newOrderDetail) {
        return addOrderDetail(newOrderDetail);
    } //save position

    private OrderDetail addOrderDetail(OrderDetail orderDetail) {
        orderDetail.setId(generateId());
        orderDetails.add(orderDetail);
        return orderDetail;
    }

    @DeleteMapping(value = "orderDetail/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Long deleteOrderDetail(@PathVariable("id")Long id) {
        return remoteOrderDetail(id);
    } // delete position

    private Long remoteOrderDetail(Long id) {
        orderDetails.removeIf(el -> el.getId().equals(id));
        return id;
    }
}

