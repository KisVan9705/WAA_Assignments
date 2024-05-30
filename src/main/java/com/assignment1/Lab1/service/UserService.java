package com.assignment1.Lab1.service;

import com.assignment1.Lab1.entity.User;
import com.assignment1.Lab1.entity.DTOs.UserDTO;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void addUser(UserDTO userDTO);
}
