package ru.example.store.dao;

import lombok.*;
import ru.example.store.dao.interfase.DAO;
import ru.example.store.model.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.example.store.utils.HibernateSessionFactoryUtil;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@NoArgsConstructor
public class CustomerDAO implements DAO<Customer, Long> {

    @Override
    public void create(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public Customer read(Long aLong) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Customer.class, aLong);
    }

    @Override
    public void update(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Customer customer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(customer);
        transaction.commit();
        session.close();
    }
}
