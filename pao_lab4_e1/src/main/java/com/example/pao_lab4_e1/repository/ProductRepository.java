package com.example.pao_lab4_e1.repository;

import com.example.pao_lab4_e1.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    public void addProduct(Product product) {
        String sql = "INSERT INTO product VALUES (NULL, ?, ?)";
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            var statement = con.prepareStatement(sql);
            statement.setString(1, product.getName()); // Inlocuieste primul '?' din query cu valoarea data
            statement.setBigDecimal(2, product.getPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Product> getProducts() {
        List<Product> list = new ArrayList<>();

        String sql = "SELECT * FROM product";
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            var statement = con.prepareStatement(sql);
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                Product product = new Product();
                product.setId(results.getInt("id"));
                product.setName(results.getString("name"));
                product.setPrice(results.getBigDecimal("price"));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
