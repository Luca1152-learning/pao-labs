package com.example.pao_lab5_e1.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "users")
public non-sealed class User extends GenericEntity {
    private int id;
    private String username;
    private String password;
}
