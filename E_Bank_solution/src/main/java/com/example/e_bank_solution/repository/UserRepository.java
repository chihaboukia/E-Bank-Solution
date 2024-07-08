package com.example.e_bank_solution.repository;

import com.example.e_bank_solution.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Utilisateur, Integer> {

}

