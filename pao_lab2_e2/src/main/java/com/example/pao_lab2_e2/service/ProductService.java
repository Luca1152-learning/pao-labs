package com.example.pao_lab2_e2.service;

import com.example.pao_lab2_e2.model.Product;
import com.example.pao_lab2_e2.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void add(Product product) {
        productRepository.add(product);
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
