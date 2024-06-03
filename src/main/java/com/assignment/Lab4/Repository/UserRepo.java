package com.assignment.Lab4.Repository;

import com.assignment.Lab4.entity.User;
import com.assignment.Lab4.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("SELECT u.posts FROM User u WHERE u.id = :userId")
    List<Post> findPostsByUserId(Long userId);
}
