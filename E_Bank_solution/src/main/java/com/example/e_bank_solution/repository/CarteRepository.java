package com.example.e_bank_solution.repository;

import com.example.e_bank_solution.model.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CarteRepository extends JpaRepository<Carte, Long> {
}
