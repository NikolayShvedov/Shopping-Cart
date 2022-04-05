package ru.example.store.dao;

import lombok.*;
import ru.example.store.dao.interfase.DAO;
import ru.example.store.model.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.example.store.utils.HibernateSessionFactoryUtil;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@NoArgsConstructor
public class OrderDAO implements DAO<Order, Long> {

    @Override
    public void create(Order order) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
        session.close();
    }

    @Override
    public Order read(Long aLong) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Order.class, aLong);
    }

    @Override
    public void update(Order order) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(order);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Order order) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(order);
        transaction.commit();
        session.close();
    }
}
