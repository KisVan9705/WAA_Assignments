package com.assignment.Lab4.service;

import com.assignment.Lab4.entity.Post;
import com.assignment.Lab4.entity.User;
import com.assignment.Lab4.entity.DTOs.UserDTO;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void addUser(UserDTO userDTO);

    public UserDTO findUserById(Long userId);
    public List<Post> getPostsByUserId(Long userId);
}
