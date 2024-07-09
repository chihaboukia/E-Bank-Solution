package com.example.e_bank_solution.controller;

import com.example.e_bank_solution.model.Compte;
import com.example.e_bank_solution.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compte")
public class CompteController {

    @Autowired
    private CompteService compteService;

    @GetMapping("/")
    public List<Compte> getComptes() {
        return compteService.getAllcompt();
    }

    @GetMapping("/{id}")
    public Compte getCompte(@PathVariable Integer id) {
        return compteService.getcomptbyid(id);
    }

    @PostMapping("/add")
    public Compte addCompte(@RequestBody Compte compte) {
        return compteService.createCompte(compte);
    }
}
