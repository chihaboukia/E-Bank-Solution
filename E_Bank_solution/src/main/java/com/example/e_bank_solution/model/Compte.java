package com.example.e_bank_solution.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
    @Getter
    @Setter
    @Entity
    public class Compte {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String type;
        private float solde;
        private LocalDate dateCreation;



    }