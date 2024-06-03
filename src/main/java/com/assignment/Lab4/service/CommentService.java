package com.assignment.Lab4.service;

import com.assignment.Lab4.entity.Comment;

import java.util.List;

public interface CommentService {

    //add comment to Post. api/v1/posts/{post-id}/comments

    //get Post along with all the comments. Should probably go in PostService.
    public List<Comment> findAllComments();
//    public void addComment(Long userID, Long postID, CommentDTO commentDTO);

    public void deleteCommentInAPost();

//    void addCommentToPost(Long postId, CommentDTO commentDTO);

//    public List<User> retrieveUsersWithNPosts(); //should go in the UserService
//
//    public Post findPostMatchingTitle(); //Should go in the PostService
//

}
