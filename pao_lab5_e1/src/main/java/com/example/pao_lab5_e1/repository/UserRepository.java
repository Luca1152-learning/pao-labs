package com.example.pao_lab5_e1.repository;

import com.example.pao_lab5_e1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
