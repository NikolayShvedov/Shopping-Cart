package com.example.shop_cart.model;

/**
 * A simple domain object representing the Enum for the OrderStatus field.
 */
public enum OrderStatus { // todo это не модель, перенести в enum package, сделать в uppercase
    created, processing, cancelled, shipped;
}
