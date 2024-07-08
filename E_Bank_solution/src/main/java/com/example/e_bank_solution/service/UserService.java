package com.example.e_bank_solution.service;

import com.example.e_bank_solution.model.Utilisateur;
import com.example.e_bank_solution.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Utilisateur> getAllUsers() {
        return userRepository.findAll();
    }

    public Utilisateur getUserById(int id) {
        return userRepository.findById(id).get();
    }
}
