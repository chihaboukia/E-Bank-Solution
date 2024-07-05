package com.example.e_bank_solution.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;
    private  String fullname_user ;
    private String mail_user ;
    private String password_user ;

    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnore //eviter boucle qui get all users
    private List<Compte> compt_list ;


}
