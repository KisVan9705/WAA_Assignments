package com.assignment1.Lab1.Repository;

import com.assignment1.Lab1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findAll();
//    Post findById(long id);
//    void save (Post post);
//    void delete(long id);
//    Post update (long id, Post post);
public List<Post> searchNameByTitle(String title);

}
