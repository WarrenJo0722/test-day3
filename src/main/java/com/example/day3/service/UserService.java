package com.example.day3.service;

import com.example.day3.client.EmailClient;
import com.example.day3.domain.User;
import com.example.day3.repository.UserRepository;

public class UserService {
    UserRepository userRepository;
    EmailClient emailClient;

    UserService(UserRepository userRepository, EmailClient emailClient) {
        this.userRepository = userRepository;
        this.emailClient = emailClient;
    }

    public User register(User user) {
        emailClient.sendWelcomeEmail(user.email);
        return userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 유저입니다"));
    }
}