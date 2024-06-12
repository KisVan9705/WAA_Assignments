package com.assignment.Lab4.service;

import com.assignment.Lab4.Repository.CommentRepo;
import com.assignment.Lab4.entity.Comment;
import com.assignment.Lab4.entity.DTOs.PostDTO;
import com.assignment.Lab4.Repository.PostRepo;
import com.assignment.Lab4.entity.Post;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;
    @Autowired
    CommentRepo commentRepo;

    private final ModelMapper modelMapper;

    @Qualifier("postMapper")
    @Autowired
    private ModelMapper postMapper;
    @Override
    public List<PostDTO> findAll() {
        return postRepo.findAll().stream().map(post -> modelMapper.map(post, PostDTO.class)).collect(Collectors.toList());
    }

    @Override
    public PostDTO findById(long id) {
        Post post = postRepo.findById(id).orElse(null);
        return (post != null) ? modelMapper.map(post, PostDTO.class): null;
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
        postRepo.deleteById(id);
    }

    @Transactional
    @Override
    public Post update(long id, PostDTO postDTO) {
        Post post = postRepo.findById(id).orElse(null);


        if(post != null){
//            post = postMapper.map(postDTO, Post.class);
            post.setAuthor(postDTO.getAuthor());
            post.setTitle(postDTO.getTitle());
            post.setContent(postDTO.getContent());
//            postRepo.save(post);
        }


        return post;
    }

    @Override
    public List<PostDTO> searchNameByText(String text) {
        return null;
    }

    @Override
    public void addCommentToPost(Long post_id, Comment comment) {
        Post post = postRepo.findById(post_id).orElse(null);
        if (post !=null){
            post.addComment(comment);
            postRepo.save(post);
        }

    }

    @Override
    public List<PostDTO> findPostByUserID(Long userID) {
        return postRepo.findPostsByUser_Id(userID);
    }

    @Override
    public List<Comment> findCommentsByPostId(Long postId){
       return postRepo.findCommentByPostId(postId);
    }
}
