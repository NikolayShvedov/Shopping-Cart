package com.example.shop_cart.controllers;

import com.example.shop_cart.model.Order;
import com.example.shop_cart.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * REST controller for {@link Order} connected requests.
 */

@RestController
@RequestMapping("/api/base/order/")
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    // функция для вывода заказа по id
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> getOrder(@PathVariable("id") Long orderId) {
        if (orderId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Order order = this.orderService.getById(orderId);

        if (order == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    //функция для создания нового заказа
    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> saveOrder(@RequestBody @Valid Order order) {
        HttpHeaders headers = new HttpHeaders();

        if (order == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.orderService.save(order);
        return new ResponseEntity<>(order, headers, HttpStatus.CREATED);
    }

    // функция для изменения статуса заказа
    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> updateOrder(@RequestBody @Valid Order order, UriComponentsBuilder builder) {
        HttpHeaders headers = new HttpHeaders();

        if (order == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.orderService.save(order);

        return new ResponseEntity<>(order, headers, HttpStatus.OK);
    }

    // функция для удаления заказа по id
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> deleteOrder(@PathVariable("id") Long id) {
        Order order = this.orderService.getById(id);

        if (order == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.orderService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // функция для вывода всех заказов
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = this.orderService.getAll();

        if (orders.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
