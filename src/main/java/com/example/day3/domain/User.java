package com.example.day3.domain;

import lombok.Getter;

@Getter
public class User {
    Long id;
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}