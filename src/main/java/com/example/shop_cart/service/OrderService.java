package com.example.shop_cart.service;

import com.example.shop_cart.model.Order;

import java.util.List;

/**
 * Service interface for {@link Order} class.
 */

public interface OrderService {

    Order getById(Long id);

    void save(Order order);

    void delete(Long id);

    List<Order> getAll();
}
