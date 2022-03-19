package com.example.pao_lab3_e1.service;

import com.example.pao_lab3_e1.model.Product;
import com.example.pao_lab3_e1.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.addProduct(product);
    }
}
