package com.assignment1.Lab1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Component
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String title;
    String content;
    String author;
}
