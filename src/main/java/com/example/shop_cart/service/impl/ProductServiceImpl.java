package com.example.shop_cart.service.impl;

import com.example.shop_cart.model.Product;
import com.example.shop_cart.repository.OrderRepository;
import com.example.shop_cart.repository.ProductRepository;
import com.example.shop_cart.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getOrdersByIn_stock(Boolean in_stock){
        return productRepository.findByProductIn_stock(in_stock);
    }
}
