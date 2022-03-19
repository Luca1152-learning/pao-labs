package com.example.pao_lab3_e1.repository;

import com.example.pao_lab3_e1.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public void addProduct(Product product){
        System.out.println("Produs adaugat");
    }
}
