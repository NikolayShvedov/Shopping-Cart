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

<<<<<<< HEAD
    public List<Product> getOrdersByIn_stock(Boolean in_stock) {
=======
    public List<Product> getOrdersByIn_stock(Boolean in_stock){
>>>>>>> 2138dcdd8144f446734598a6b716d955b0e5d1f2
        return productRepository.findProductByInStock(in_stock);
    }
}