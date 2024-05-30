package com.assignment1.Lab1.service;

import com.assignment1.Lab1.Repository.UserRepo;
import com.assignment1.Lab1.entity.User;

import com.assignment1.Lab1.entity.DTOs.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void addUser(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        userRepo.save(user);
    }
}
