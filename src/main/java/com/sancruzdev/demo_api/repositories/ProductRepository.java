package com.sancruzdev.demo_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sancruzdev.demo_api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
