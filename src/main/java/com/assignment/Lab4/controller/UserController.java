package com.assignment.Lab4.controller;


import com.assignment.Lab4.entity.Post;
import com.assignment.Lab4.entity.User;
import com.assignment.Lab4.entity.DTOs.UserDTO;
import com.assignment.Lab4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")

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

    @GetMapping("/{userId}/posts")
    public List<Post> getPostsByUserId(@PathVariable Long userId) {
        return userService.getPostsByUserId(userId);
    }

    @GetMapping("/{userId}")
    public UserDTO findUserById(@PathVariable Long userId){
        return userService.findUserById(userId);
    }
}
