package com.example.shopping_cart.service.impl;

import com.example.shopping_cart.model.OrderDetail;
import com.example.shopping_cart.repositories.OrderDetailRepository;
import com.example.shopping_cart.service.OrderDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetail> getOrderDetailByOrderId(Long orderId){
        return orderDetailRepository.findByOrderId(orderId);
    }
}
