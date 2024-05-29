package com.assignment1.Lab1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Component
public class Post {
    long id;
    String title;
    String content;
    String author;
}
