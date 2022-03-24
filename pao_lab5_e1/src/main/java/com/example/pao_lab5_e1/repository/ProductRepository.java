package com.example.pao_lab5_e1.repository;

import com.example.pao_lab5_e1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where p.name = :name")
    public Optional<Product> findProductByName(String name);
}
