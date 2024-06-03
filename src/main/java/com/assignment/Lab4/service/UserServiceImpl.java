package com.assignment.Lab4.service;

import com.assignment.Lab4.Repository.UserRepo;
import com.assignment.Lab4.aspect.ExecutionTime;
import com.assignment.Lab4.entity.Post;
import com.assignment.Lab4.entity.User;

import com.assignment.Lab4.entity.DTOs.UserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Qualifier("userMapper")
    @Autowired
    private ModelMapper userMapper;

    @Override
    @ExecutionTime
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void addUser(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
//        user.setPosts(userDTO.getPosts());
        userRepo.save(user);
    }

    @Override
    public List<Post> getPostsByUserId(Long userId) {
        return userRepo.findPostsByUserId(userId);
    }

    @Override
    public UserDTO findUserById(Long userId){
//       UserDTO mapper = new UserDTO();
//
//        User result = userRepo.findById(userId).orElse(null);
//        mapper.setId(result.getId());
//        mapper.setName(result.getName());
//        mapper.setPosts(result.getPosts());
//        return mapper;
        User user = userRepo.findById(userId).orElse(null);
        return (user !=null)? userMapper.map(user, UserDTO.class) : null;
    }
}
