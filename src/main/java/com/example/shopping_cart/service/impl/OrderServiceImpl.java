package com.example.shopping_cart.service.impl;


import com.example.shopping_cart.model.Order;
import com.example.shopping_cart.repositories.OrderRepository;
import com.example.shopping_cart.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
