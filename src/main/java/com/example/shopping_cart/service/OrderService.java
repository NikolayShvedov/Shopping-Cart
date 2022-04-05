package com.example.shopping_cart.service;

import com.example.shopping_cart.model.Order;

/**
 * Service interface for {@link Order} class.
 */

public interface OrderService {
    Order getById(Long id);
}
