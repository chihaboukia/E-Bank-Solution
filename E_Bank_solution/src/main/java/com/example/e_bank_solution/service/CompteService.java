package com.example.e_bank_solution.service;

import com.example.e_bank_solution.model.Compte;
import com.example.e_bank_solution.repository.CompteRepository;
import com.example.e_bank_solution.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CompteService {

    @Autowired
    private CompteRepository compteRepository;

    @Autowired
    private UserRepository utilisateurRepository;

    public Compte createCompte(Compte compte) {

        return compteRepository.save(compte);
    }
    public Compte getcomptbyid(Integer id) {
        return compteRepository.findById(id).orElse(null);
    }

    public List<Compte> getAllcompt() {
        return compteRepository.findAll();
    }

    public void deletecompt(Integer id) {
        compteRepository.deleteById(id);
    }
}
