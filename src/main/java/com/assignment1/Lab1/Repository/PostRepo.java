package com.assignment1.Lab1.Repository;

import com.assignment1.Lab1.entity.Post;

import java.util.List;

public interface PostRepo {
    List<Post> findAll();
    Post findById(long id);
    void save (Post post);
    void delete(long id);
    Post update (long id, Post post);
    List<Post> searchNameByText(String text);
}
