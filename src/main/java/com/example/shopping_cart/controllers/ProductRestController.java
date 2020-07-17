package com.example.shopping_cart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping_cart.model.Product;
import com.example.shopping_cart.repositories.ProductRepository;
import com.example.shopping_cart.service.ProductService;

@RestController
@RequestMapping("api/base/")
public class ProductRestController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    private Long counter = 0L;

    private Long generateId() {
        return counter++;
    }

    List<Product> products;

    @GetMapping("product/{inStock}")
    public List<Product> getProduct(@PathVariable Boolean inStock){
        return productService.getProductByInStock(inStock);
    } // show product by inStock
}
