package com.example.pao_lab5_e1.controller;

import com.example.pao_lab5_e1.entities.Product;
import com.example.pao_lab5_e1.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> findProducts() {
        return productService.findProducts();
    }

    @GetMapping("/product/{name}")
    public ResponseEntity<Product> findProductByName(String name) {
        var p = productService.findProductByName(name);
//        if (p == null) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.of(Optional.of(p));
//        }
        if (p.isPresent()) {
            return ResponseEntity.of(p);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
