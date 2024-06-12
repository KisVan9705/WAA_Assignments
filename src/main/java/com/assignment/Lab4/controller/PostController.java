package com.assignment.Lab4.controller;

import com.assignment.Lab4.entity.Comment;
import com.assignment.Lab4.entity.DTOs.PostDTO;
import com.assignment.Lab4.entity.Post;
import com.assignment.Lab4.service.CommentService;
import com.assignment.Lab4.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/posts")
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:5173")

public class PostController {

    private final PostService postService;
    private final CommentService commentService;

    @GetMapping()
    public  List<PostDTO> getAllPosts(){
        return postService.findAll();
    }

    @PutMapping("/{id}")
    public Post UpdatePost(@PathVariable Long id, @RequestBody PostDTO postDTO){
       return postService.update(id, postDTO);
    }


//    @GetMapping
//    public List<PostDTO> getAllPostsByUser(@PathVariable ("userID") Long userID){
//        return postService.findPostByUserID(userID);
//    }

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
// to add a comment that will be associated with its post.

    @PostMapping("/{id}/comments")
    public String addCommentToPost(@PathVariable ("id") Long post_id, @RequestBody Comment comment){
        postService.addCommentToPost(post_id, comment);
//        commentService.(commentDTO);
        return "Comment Added to post:" + Long.toString(post_id);
    }

    @GetMapping("/{id}/comments")
    public List<Comment> getCommentsByPostId(@PathVariable ("id") Long postId){
       return postService.findCommentsByPostId(postId);
    }
}
