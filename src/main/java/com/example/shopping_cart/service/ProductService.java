package com.example.shopping_cart.service;

import com.example.shopping_cart.model.Product;

import java.util.List;

/**
 * Service interface for {@link Product} class.
 */

public interface ProductService {
    List<Product> getProductByInStock(Boolean inStock);
}
