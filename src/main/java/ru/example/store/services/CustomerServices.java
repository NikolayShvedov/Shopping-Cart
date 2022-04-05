package ru.example.store.services;

import lombok.*;
import ru.example.store.dao.CustomerDAO;
import ru.example.store.model.Customer;

/**
 * Author : Danyil Smirnov.
 * Created : 09/07/2020.
 */
@NoArgsConstructor
public class CustomerServices {
    private CustomerDAO customerDAO = new CustomerDAO();

    public void createCustomer(Customer customer){
        customerDAO.create(customer);
    }

    public Customer readCustomer(long aLong){
        return customerDAO.read(aLong);
    }

    public void updateCustomer(Customer customer){
        customerDAO.update(customer);
    }

    public void deleteCustomer(Customer customer){
        customerDAO.delete(customer);
    }
}
