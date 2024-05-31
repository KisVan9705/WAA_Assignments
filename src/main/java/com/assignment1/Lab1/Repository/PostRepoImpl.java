//package com.assignment1.Lab1.Repository;
//
//import com.assignment1.Lab1.entity.Post;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//public class PostRepoImpl implements PostRepo {
//    List<Post> posts = new ArrayList<>();
//    @Override
//    public List<Post> findAll() {
//        return posts;
//    }
//
//    @Override
//    public Post findById(long id) {
//        return posts.stream().filter(post -> post.getId() == id).findAny().orElse(null);
//    }
//
////    @Override
////    public void save(Post post) {
////        posts.add(post);
////    }
//
////    @Override
////    public void delete(long id) {
////        posts = posts.stream().filter(post -> post.getId() != id).collect(Collectors.toList());
////    }
////
////    @Override
////    public Post update(long id, Post post) {
////        return null;
////    }
////
////    @Override
////    public List<Post> searchNameByText(String text) {
////        return null;
////    }
//}

