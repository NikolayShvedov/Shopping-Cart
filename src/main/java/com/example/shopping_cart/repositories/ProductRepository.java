package com.example.shopping_cart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping_cart.model.Product;

import java.util.List;

/**
 * Repository interface for {@link Product} class.
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByInStock(Boolean inStock);
}
