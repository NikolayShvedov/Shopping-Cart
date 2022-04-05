package ru.example.store;

import ru.example.store.model.Customer;
import ru.example.store.services.CustomerServices;
import ru.example.store.utils.HibernateSessionFactoryUtil;

public class Main {

    public static void main(String[] args){
        CustomerServices customerServices = new CustomerServices();
        Customer customer = customerServices.readCustomer(1);
        System.out.println(customer.toString());
        HibernateSessionFactoryUtil.closeSessionFactory();
    }
}