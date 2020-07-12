package com.example.shop_cart.controllers;

import com.example.shop_cart.model.Product;
import com.example.shop_cart.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * REST controller for {@link Product} connected requests.
 */

@RestController
@RequestMapping("/api/base/order/")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProductByIn_stock/{in_stock}")
    public ResponseEntity<List<Product>> getOrdersByIn_stockProduct(@PathVariable Boolean in_stock){
        if (in_stock == false) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        List<Product> ordersByIn_stock = this.productService.getOrdersByIn_stock(in_stock);

        if (ordersByIn_stock == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(ordersByIn_stock, HttpStatus.OK);
    }
}
