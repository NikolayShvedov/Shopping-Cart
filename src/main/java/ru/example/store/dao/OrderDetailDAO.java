package ru.example.store.dao;

import lombok.*;
import ru.example.store.dao.interfase.DAO;
import ru.example.store.model.OrderDetail;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.example.store.utils.HibernateSessionFactoryUtil;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@NoArgsConstructor
public class OrderDetailDAO implements DAO<OrderDetail, Long> {

    @Override
    public void create(OrderDetail orderDetail) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(orderDetail);
        transaction.commit();
        session.close();
    }

    @Override
    public OrderDetail read(Long aLong) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(OrderDetail.class, aLong);
    }

    @Override
    public void update(OrderDetail orderDetail) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(orderDetail);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(OrderDetail orderDetail) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(orderDetail);
        transaction.commit();
        session.close();
    }
}
