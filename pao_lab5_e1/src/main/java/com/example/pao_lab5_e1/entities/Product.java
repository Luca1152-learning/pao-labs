package com.example.pao_lab5_e1.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "products")
public non-sealed class Product extends  GenericEntity {
    private String name;
    private BigDecimal price;
}
