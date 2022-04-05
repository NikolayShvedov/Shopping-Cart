package ru.example.store.services;

import lombok.*;
import ru.example.store.dao.ProductDAO;
import ru.example.store.model.Product;

/**
 * Author : Danyil Smirnov.
 * Created : 09/07/2020.
 */
@NoArgsConstructor
public class ProductServices {
    private ProductDAO productDAO = new ProductDAO();

    public void createOrder(Product product){
        productDAO.create(product);
    }

    public Product readOrder(long aLong){
        return productDAO.read(aLong);
    }

    public void updateOrder(Product product){
        productDAO.update(product);
    }

    public void deleteOrder(Product product){
        productDAO.delete(product);
    }
}
