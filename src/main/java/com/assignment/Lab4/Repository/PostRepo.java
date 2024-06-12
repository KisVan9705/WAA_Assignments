package com.assignment.Lab4.Repository;

import com.assignment.Lab4.entity.Comment;
import com.assignment.Lab4.entity.DTOs.PostDTO;
import com.assignment.Lab4.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
//    List<Post> findAll();
//    Post findById(long id);
//    void save (Post post);
//    void delete(long id);
//    Post update (long id, Post post);
//public List<Post> searchNameByTitle(String title);


//find comments by post id;
    @Query("SELECT p.comments FROM Post p WHERE p.id = :postId")
    List<Comment> findCommentByPostId(Long postId);


    List<PostDTO> findPostsByUser_Id(Long userID);
}
