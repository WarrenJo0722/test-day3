package com.example.day3.repository;

import com.example.day3.domain.User;

public interface UserRepository {
    User save(User user);
}