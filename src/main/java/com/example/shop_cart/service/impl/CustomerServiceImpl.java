package com.example.shop_cart.service.impl;

import com.example.shop_cart.model.Customer;
import com.example.shop_cart.repository.CustomerRepository;
import com.example.shop_cart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
}

