package com.assignment.Lab4.entity.DTOs;

import com.assignment.Lab4.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    private Long id;
    String name;
    List<Post> posts;
}
