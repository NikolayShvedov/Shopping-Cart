package com.example.shop_cart.service;


import com.example.shop_cart.model.OrderDetail;

import java.util.List;

/**
 * Service interface for {@link OrderDetail} class.
 */
public interface OrderDetailService {

    OrderDetail getById(Long id);

    OrderDetail getByOrderId(Long order_id);

    void save(OrderDetail orderDetail);

    void delete(Long id);

    List<OrderDetail> getAll();
}
