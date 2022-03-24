package com.example.pao_lab5_e1.service;

import com.example.pao_lab5_e1.entities.Product;
import com.example.pao_lab5_e1.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> findProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> findProductByName(String name){
        return productRepository.findProductByName(name);
    }
}
