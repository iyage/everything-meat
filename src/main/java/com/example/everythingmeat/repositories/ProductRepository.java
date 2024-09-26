package com.example.everythingmeat.repositories;

import com.example.everythingmeat.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}