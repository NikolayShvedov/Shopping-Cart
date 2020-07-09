package com.example.shop_cart.controllers;

import com.example.shop_cart.model.OrderDetail;
import com.example.shop_cart.service.OrderDetailService;

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
 * REST controller for {@link OrderDetail} connected requests.
 */

@RestController
@RequestMapping("/api/base/orderDetail/")
public class OrderDetailRestController {

    @Autowired
    private OrderDetailService orderDetailService;

    // функция для отображения всех позиций по order_id
    @RequestMapping(value = "{order_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrderDetail> getOrderDetail(@PathVariable("order_id") Long orderId) {
        if (orderId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        OrderDetail orderDetail = this.orderDetailService.getByOrderId(orderId);

        if (orderDetail == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(orderDetail, HttpStatus.OK);
    }

    //функция для добавления новой позиции
    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrderDetail> saveOrderDetail(@RequestBody @Valid OrderDetail orderDetail) {
        HttpHeaders headers = new HttpHeaders();

        if (orderDetail == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.orderDetailService.save(orderDetail);
        return new ResponseEntity<>(orderDetail, headers, HttpStatus.CREATED);
    }

    // функция для обновлении позиции
    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrderDetail> updateOrderDetail(@RequestBody @Valid OrderDetail orderDetail, UriComponentsBuilder builder) {
        HttpHeaders headers = new HttpHeaders();

        if (orderDetail == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.orderDetailService.save(orderDetail);

        return new ResponseEntity<>(orderDetail, headers, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<OrderDetail> deleteOrderDetail(@PathVariable("id") Long id) {
        OrderDetail orderDetail = this.orderDetailService.getById(id);

        if (orderDetail == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.orderDetailService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // функция для удаления позиции
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<OrderDetail>> getAllOrderDetail() {
        List<OrderDetail> orderDetail = this.orderDetailService.getAll();

        if (orderDetail.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(orderDetail, HttpStatus.OK);
    }
}
