package com.example.shopping_cart.service.impl;

import com.example.shopping_cart.model.Product;
import com.example.shopping_cart.repositories.ProductRepository;
import com.example.shopping_cart.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProductByInStock(Boolean inStock){
        return productRepository.findByInStock(inStock);
    }
}
