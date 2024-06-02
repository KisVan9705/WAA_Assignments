package com.assignment1.Lab1.service;

import com.assignment1.Lab1.Repository.CommentRepo;
import com.assignment1.Lab1.Repository.PostRepo;
import com.assignment1.Lab1.Repository.UserRepo;
import com.assignment1.Lab1.entity.Comment;
import com.assignment1.Lab1.entity.DTOs.CommentDTO;
import com.assignment1.Lab1.entity.DTOs.PostDTO;
import com.assignment1.Lab1.entity.Post;
import com.assignment1.Lab1.entity.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Data
@Service
public class CommentServiceImpl implements CommentService{

    private final CommentRepo commentRepo;
    private final UserRepo userRepo;
    private final PostRepo postRepo;


    @Autowired
    public CommentServiceImpl(CommentRepo commentRepo, UserRepo userRepo, PostRepo postRepo) {
        this.commentRepo = commentRepo;
        this.userRepo = userRepo;
        this.postRepo = postRepo;
    }

    @Override
    public List<Comment> findAllComments() {
        return commentRepo.findAll();
    }

//    @Override
//    public void addComment(Long postID, CommentDTO commentDTO) {
////        userRepo.findUserById(userID).getPosts().stream().filter(post -> post.getId() == postID)
//        Post p = postRepo.findById(postID).orElse(null);
//
//        if(p != null){
//            //use mapper
//            Comment comment = new Comment();
//            comment.setId(commentDTO.getId());
//            comment.setName(commentDTO.getName());
//            p.addComment(comment);
//
//            commentRepo.save(comment);
//            postRepo.save(p);
//        }
//    }

    @Override
    public void deleteCommentInAPost() {

    }

//This did not work due to some SQL key duplication error.
//    @Transactional
//    public void addCommentToPost(Long postId, CommentDTO commentDTO) {
//        PostDTO postDTO = postService.findById(postId);
//
//        if (postDTO == null) {
//            throw new ResourceAccessException("Post not found");
//        }
//        Post post = new Post();
//        post.setId(postDTO.getId());
//        post.setTitle(postDTO.getTitle());
//        post.setContent(postDTO.getContent());
//        post.setAuthor(postDTO.getAuthor());
//        post.setComments(postDTO.getComments());
//
//        Comment comment = new Comment();
//        comment.setPost(post);
//        commentRepo.save(comment);
//    }
}
