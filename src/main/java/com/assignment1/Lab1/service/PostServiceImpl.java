package com.assignment1.Lab1.service;

import com.assignment1.Lab1.Repository.CommentRepo;
import com.assignment1.Lab1.entity.Comment;
import com.assignment1.Lab1.entity.DTOs.CommentDTO;
import com.assignment1.Lab1.entity.DTOs.PostDTO;
import com.assignment1.Lab1.Repository.PostRepo;
import com.assignment1.Lab1.entity.Post;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;
    @Autowired
    CommentRepo commentRepo;

    private final ModelMapper modelMapper;
    @Override
    public List<PostDTO> findAll() {
        return postRepo.findAll().stream().map(post -> modelMapper.map(post, PostDTO.class)).collect(Collectors.toList());
    }

    @Override
    public PostDTO findById(long id) {
        Post post = postRepo.findById(id).get();
        return post != null ? modelMapper.map(post, PostDTO.class): null;
    }

    @Override
    public void save(PostDTO postDto) {
        Post post = new Post();
        post.setAuthor(postDto.getAuthor());
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        postRepo.save(post);
    }

    @Override
    public void delete(long id) {
//        postRepo.delete(id);
    }

    @Override
    public Post update(long id, Post post) {
        return null;
    }

    @Override
    public List<PostDTO> searchNameByText(String text) {
        return null;
    }

//    @Override
//    public void addCommentToPost(Long post_id, Comment comment) {
//        Optional<Post> post = postRepo.findById(post_id);
//
//    }
    @Override
    public List<Comment> findCommentsByPostId(Long postId){
       return postRepo.findCommentByPostId(postId);
    }
}
