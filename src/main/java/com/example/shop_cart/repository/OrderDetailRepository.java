package com.example.shop_cart.repository;

import com.example.shop_cart.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link OrderDetail} class.
 */

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{
}
