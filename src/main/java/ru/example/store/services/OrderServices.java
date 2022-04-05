package ru.example.store.services;

import lombok.*;
import ru.example.store.dao.OrderDAO;
import ru.example.store.model.Order;

/**
 * Author : Danyil Smirnov.
 * Created : 09/07/2020.
 */
@NoArgsConstructor
public class OrderServices {
    private OrderDAO orderDAO = new OrderDAO();

    public void createOrder(Order order){
        orderDAO.create(order);
    }

    public Order readOrder(long aLong){
        return orderDAO.read(aLong);
    }

    public void updateOrder(Order order){
        orderDAO.update(order);
    }

    public void deleteOrder(Order order){
        orderDAO.delete(order);
    }
}
