package com.example.shop_cart.controllers;

import com.example.shop_cart.model.Product;
import com.example.shop_cart.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * REST controller for {@link Product} connected requests.
 */

@RestController
@RequestMapping("/api/base/order/")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProductByIn_stock/{in_stock}")
    public ResponseEntity<Product> getProductByIn_stock(@PathVariable Boolean in_stock){
        if (in_stock == false) { // todo здесь возможно NPE
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Product product = (Product) this.productService.getOrdersByIn_stock(in_stock); // todo переделать, здесь будет ошибка, т.к. получаем List из метода

        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
