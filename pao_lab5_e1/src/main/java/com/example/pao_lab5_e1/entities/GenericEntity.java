package com.example.pao_lab5_e1.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract sealed class GenericEntity permits Product, User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
}
