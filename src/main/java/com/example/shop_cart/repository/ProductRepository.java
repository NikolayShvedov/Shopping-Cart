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
<<<<<<< HEAD
    List<Product> findProductByInStock(Boolean in_stock);
=======
    List<Product> findProductByInStock(Boolean in_stock); // в прежнем наименовании метода не сработает
>>>>>>> 2138dcdd8144f446734598a6b716d955b0e5d1f2
}
