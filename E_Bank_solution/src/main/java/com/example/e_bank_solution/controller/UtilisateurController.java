package com.example.e_bank_solution.controller;

import com.example.e_bank_solution.model.Utilisateur;
import com.example.e_bank_solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/User")
public class UtilisateurController {
    @Autowired
     UserService userService;
    @PostMapping("/add")
    public Utilisateur addUser(@RequestBody Utilisateur utilisateur) {
        return userService.createUser(utilisateur);
    }
    @GetMapping("/")
    public List<Utilisateur> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/id")
    public Utilisateur getUserById(@RequestParam int id) {
        return userService.getUserById(id);
    }
}
