package com.example.pao_lab3_e1.controller;

import com.example.pao_lab3_e1.model.Product;
import com.example.pao_lab3_e1.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product")
    public void addProduct(Product product) {
        productService.addProduct(product);
    }
}
