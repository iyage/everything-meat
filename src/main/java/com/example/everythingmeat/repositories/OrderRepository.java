package com.example.everythingmeat.repositories;

import com.example.everythingmeat.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}