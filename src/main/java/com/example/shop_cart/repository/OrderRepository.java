package com.example.shop_cart.repository;

import com.example.shop_cart.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Order} class.
 */

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
}
