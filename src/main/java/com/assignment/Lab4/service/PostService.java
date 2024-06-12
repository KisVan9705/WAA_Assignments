package com.assignment.Lab4.service;

import com.assignment.Lab4.entity.Comment;
import com.assignment.Lab4.entity.DTOs.PostDTO;
import com.assignment.Lab4.entity.Post;

import java.util.List;

public interface PostService {
    List<PostDTO> findAll();
    PostDTO findById(long id);
    void save (PostDTO post);
    void delete(long id);
    Post update (long id, PostDTO postDTO);
    List<PostDTO> searchNameByText(String text);

    public List<Comment> findCommentsByPostId(Long postId);

//    to add comment to specific post
    void addCommentToPost(Long post_id, Comment comment);

    List<PostDTO> findPostByUserID(Long userID);
}
