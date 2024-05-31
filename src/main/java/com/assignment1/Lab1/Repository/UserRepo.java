package com.assignment1.Lab1.Repository;

import com.assignment1.Lab1.entity.Post;
import com.assignment1.Lab1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("SELECT u.posts FROM User u WHERE u.id = :userId")
    List<Post> findPostsByUserId(Long userId);

    User findUserById(Long userId);




}
