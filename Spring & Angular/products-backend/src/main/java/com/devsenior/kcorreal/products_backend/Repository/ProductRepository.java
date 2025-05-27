package com.devsenior.kcorreal.products_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.kcorreal.products_backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
