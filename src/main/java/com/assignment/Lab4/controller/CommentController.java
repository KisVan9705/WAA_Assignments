package com.assignment.Lab4.controller;

import com.assignment.Lab4.entity.Comment;
import com.assignment.Lab4.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users/{userID}/posts/{postID}/comments")

public class CommentController {
    @Autowired
    private final CommentService commentService;

//    @PostMapping
//    public String setComment(@PathVariable Long userID, @PathVariable Long postID, @RequestBody CommentDTO comment){
//        commentService.addComment(userID, postID, comment);
//        return "Comment Successfully added";
//    }

    @GetMapping
    public List<Comment> getAllComments(){
       return commentService.findAllComments();
    }
}
