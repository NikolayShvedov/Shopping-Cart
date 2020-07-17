package com.example.shopping_cart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping_cart.model.Order;

/**
 * Repository interface for {@link Order} class.
 */

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
