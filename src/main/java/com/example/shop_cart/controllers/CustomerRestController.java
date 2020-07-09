package com.example.shop_cart.controllers;

import com.example.shop_cart.model.Customer;
import com.example.shop_cart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * REST controller for {@link Customer} connected requests.
 */

@RestController
@RequestMapping("/api/base/customers/")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;
}
