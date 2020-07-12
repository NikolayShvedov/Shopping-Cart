package com.example.shop_cart.model.enums;

/**
 * A simple domain object representing the Enum for the OrderStatus field.
 */
public enum OrderStatus {
    created, processing, cancelled, shipped;

    @Override
    public String toString() {
        return name().toUpperCase();
    }
}
