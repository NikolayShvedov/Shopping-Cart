package com.example.shop_cart.service;

import com.example.shop_cart.model.Product;

import java.util.List;

/**
 * Service interface for {@link Product} class.
 */
public interface ProductService {

    List<Product> getOrdersByIn_stock(Boolean in_stock);
}
