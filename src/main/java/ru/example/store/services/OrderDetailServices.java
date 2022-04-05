package ru.example.store.services;

import lombok.*;
import ru.example.store.dao.OrderDetailDAO;
import ru.example.store.model.OrderDetail;

/**
 * Author : Danyil Smirnov.
 * Created : 09/07/2020.
 */
@NoArgsConstructor
public class OrderDetailServices {
    private OrderDetailDAO orderDetailDAO = new OrderDetailDAO();

    void createOrderDetail(OrderDetail orderDetail){
        orderDetailDAO.create(orderDetail);
    }

    OrderDetail readOrderDetail(long aLong){
        return orderDetailDAO.read(aLong);
    }

    void updateOrderDetail(OrderDetail orderDetail){
        orderDetailDAO.update(orderDetail);
    }

    void deleteOrderDetail(OrderDetail orderDetail){
        orderDetailDAO.delete(orderDetail);
    }
}
