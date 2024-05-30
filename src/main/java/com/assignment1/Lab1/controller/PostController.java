package com.assignment1.Lab1.controller;

import com.assignment1.Lab1.entity.DTOs.PostDTO;
import com.assignment1.Lab1.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/posts")
@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;


    @GetMapping
    public List<PostDTO> getAllPosts(){
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public PostDTO getPostById(@PathVariable ("id") long id){
        return postService.findById(id);
    }

    @PostMapping
    public String addPost(@RequestBody PostDTO post){
        postService.save(post);
        return "Post added successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") long id){
        postService.delete(id);
        return "Post deleted";
    }
}
