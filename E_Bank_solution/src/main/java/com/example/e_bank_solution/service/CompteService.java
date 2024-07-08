package com.example.e_bank_solution.service;

import com.example.e_bank_solution.model.Compte;
import com.example.e_bank_solution.repository.CompteRepository;
import com.example.e_bank_solution.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CompteService {

    @Autowired
    private CompteRepository compteRepository;

    @Autowired
    private UserRepository utilisateurRepository;

    public Compte createCompte(int id, String type, float solde) {
        Compte compte = new Compte();
        compte.setType(type);
        compte.setSolde(solde);
        compte.setDateCreation(LocalDate.now());
        compte.setUtilisateur(utilisateurRepository.getReferenceById(id));
        return compteRepository.save(compte);
    }
}
