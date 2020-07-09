package com.example.shop_cart.service.impl;

import com.example.shop_cart.model.Order;
import com.example.shop_cart.repository.OrderRepository;
import com.example.shop_cart.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getById(Long id) {
        return orderRepository.findOne(id);
    }

    @Override
    public void save(Order customer) {
        orderRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        orderRepository.delete(id);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}
