package com.assignment1.Lab1.entity.DTOs;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
public class PostDTO {
    long id;
    String title;
    String content;
    String author;
}
