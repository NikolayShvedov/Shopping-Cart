package com.example.shop_cart.repository;

import com.example.shop_cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for {@link Product} class.
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByProductIn_stock(Boolean in_stock);
}
