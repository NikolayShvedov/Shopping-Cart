package ru.example.store.dao;

import lombok.*;
import ru.example.store.dao.interfase.DAO;
import ru.example.store.model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.example.store.utils.HibernateSessionFactoryUtil;

/**
 * Author : Danyil Smirnov.
 * Created : 02/07/2020.
 */
@NoArgsConstructor
public class ProductDAO implements DAO<Product, Long> {

    @Override
    public void create(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    @Override
    public Product read(Long aLong) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Product.class, aLong);
    }

    @Override
    public void update(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(product);
        transaction.commit();
        session.close();
    }
}
