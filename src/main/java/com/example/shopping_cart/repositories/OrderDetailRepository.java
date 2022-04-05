package com.example.shopping_cart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping_cart.model.OrderDetail;

import java.util.List;

/**
 * Repository interface for {@link OrderDetail} class.
 */

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    List<OrderDetail> findByOrderId(Long OrderId);
}
