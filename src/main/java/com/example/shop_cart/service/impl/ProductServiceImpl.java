package com.example.shop_cart.service.impl;

import com.example.shop_cart.model.Product;
import com.example.shop_cart.repository.ProductRepository;

import com.example.shop_cart.service.OrderService;
import com.example.shop_cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getOrdersByIn_stock(Boolean in_stock) {
        return productRepository.findProductByInStock(in_stock);
    }
}