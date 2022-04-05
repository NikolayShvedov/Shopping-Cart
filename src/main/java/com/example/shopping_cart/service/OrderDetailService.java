package com.example.shopping_cart.service;

import com.example.shopping_cart.model.OrderDetail;

import java.util.List;

/**
 * Service interface for {@link OrderDetail} class.
 */

public interface OrderDetailService {
    List<OrderDetail> getOrderDetailByOrderId(Long orderId);
}
