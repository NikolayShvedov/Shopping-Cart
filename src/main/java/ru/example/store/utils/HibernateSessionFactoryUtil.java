package ru.example.store.utils;

import lombok.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ru.example.store.model.Customer;
import ru.example.store.model.Order;
import ru.example.store.model.OrderDetail;
import ru.example.store.model.Product;

@NoArgsConstructor
public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Customer.class);
                configuration.addAnnotatedClass(Order.class);
                configuration.addAnnotatedClass(OrderDetail.class);
                configuration.addAnnotatedClass(Product.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }

    public static void closeSessionFactory() {
        sessionFactory.close();
    }
}