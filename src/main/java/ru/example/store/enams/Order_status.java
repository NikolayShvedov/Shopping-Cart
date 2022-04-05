package ru.example.store.enams;

public enum Order_status {
    CREATRD("created"), PROCESSING("processing"), CANCELLED("cancelled"), SHIPPED("shipped");

    Order_status(String status) {
    }
}
