package com.assignment1.Lab1.controller;


import com.assignment1.Lab1.entity.User;
import com.assignment1.Lab1.entity.DTOs.UserDTO;
import com.assignment1.Lab1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public void addUser(@RequestBody UserDTO user){
        userService.addUser(user);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
