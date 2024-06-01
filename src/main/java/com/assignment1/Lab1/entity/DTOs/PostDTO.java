package com.assignment1.Lab1.entity.DTOs;

import com.assignment1.Lab1.entity.Comment;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
public class PostDTO {
    long id;
    String title;
    String content;
    String author;
    List<Comment> comments;
}
