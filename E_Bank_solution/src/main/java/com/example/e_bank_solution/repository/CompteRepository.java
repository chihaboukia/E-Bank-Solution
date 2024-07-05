package com.example.e_bank_solution.repository;

import com.example.e_bank_solution.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Integer> {

}
