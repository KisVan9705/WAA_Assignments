package com.assignment1.Lab1.entity;

import jakarta.persistence.*;

import lombok.Data;

import lombok.RequiredArgsConstructor;


import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "users") // Use a different table name because user is a reserved keyword in SQL that throws SQLException
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;

    @OneToMany
    @JoinColumn(name = "user_id")
    List<Post> posts;
}
