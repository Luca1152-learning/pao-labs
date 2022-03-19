package com.example.pao_lab2_e2.repository;

import com.example.pao_lab2_e2.model.Product;

import java.util.List;

public interface ProductRepository {
    public void add(Product product);

    List<Product> getAll();
}
