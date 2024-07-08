package com.example.e_bank_solution.service;

import com.example.e_bank_solution.model.Compte;
import com.example.e_bank_solution.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CompteService {
    @Autowired
    private CompteRepository compteRepository;
    public compte creatcompt(int id, String type, float solde) {
        Compte compt = new Compte();
        compt.setType(type);
        compt.setSolde(solde);
        compt.setDateCreation(LocalDate.now());
        compt.setUtilisateur(userRepository.getReferenceById(id));
        return CompteRepository.save(compt);

    }
}
