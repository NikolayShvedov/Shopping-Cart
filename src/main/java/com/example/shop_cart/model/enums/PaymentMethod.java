package com.example.shop_cart.model.enums;

/**
 * A simple domain object representing the Enum for the PaymentMethod field.
 */
public enum PaymentMethod {
    CREDIT_CARD, PAY_PAL, ON_RECEIPT;

    @Override
    public String toString() {
        return name().toUpperCase();
    }
}
