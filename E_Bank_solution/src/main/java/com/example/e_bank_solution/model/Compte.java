package com.example.e_bank_solution.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
    @Getter
    @Setter
    @Entity
    public class Compte {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String type;
        private Double solde;
        private Date dateCreation;
        private String raisonFermeture;


    }