package com.assignment1.Lab1.entity.DTOs;

import com.assignment1.Lab1.entity.Post;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    private Long id;
    String name;
    List<Post> posts;
}
