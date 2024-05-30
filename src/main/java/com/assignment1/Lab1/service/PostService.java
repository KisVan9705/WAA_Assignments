package com.assignment1.Lab1.service;

import com.assignment1.Lab1.entity.DTOs.PostDTO;
import com.assignment1.Lab1.entity.Post;

import java.util.List;

public interface PostService {
    List<PostDTO> findAll();
    PostDTO findById(long id);
    void save (PostDTO post);
    void delete(long id);
    Post update (long id, Post post);
    List<PostDTO> searchNameByText(String text);
}
