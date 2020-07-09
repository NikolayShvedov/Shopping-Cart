package com.example.shop_cart.repository;

import com.example.shop_cart.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Repository interface for {@link Customer} class.
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
