package com.example.shop_cart.service.impl;

import com.example.shop_cart.service.OrderDetailService;
import com.example.shop_cart.model.OrderDetail;
import com.example.shop_cart.repository.OrderDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;
    private OrderDetail orderDetail;

    @Override
    public OrderDetail getById(Long id) {
        return orderDetailRepository.findOne(id);
    }

    @Override
    public OrderDetail getByOrderId(Long order_id) {
        return orderDetailRepository.findOne(orderDetail.getOrderId());
    }

    @Override
    public void save(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(Long id) {
        orderDetailRepository.delete(id);
    }

    @Override
    public List<OrderDetail> getAll() {
        return orderDetailRepository.findAll();
    }
}
