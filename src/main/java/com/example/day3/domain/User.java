package com.example.day3.domain;

public class User {
    public Long id;
    public String name;
    public String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}