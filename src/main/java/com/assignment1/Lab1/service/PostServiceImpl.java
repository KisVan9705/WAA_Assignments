package com.assignment1.Lab1.service;

import com.assignment1.Lab1.PostDTO;
import com.assignment1.Lab1.Repository.PostRepo;
import com.assignment1.Lab1.entity.Post;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service

public class PostServiceImpl implements PostService{
    private final PostRepo postRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<PostDTO> findAll() {
        return postRepo.findAll().stream().map(post -> modelMapper.map(post, PostDTO.class)).collect(Collectors.toList());
    }

    @Override
    public PostDTO findById(long id) {
        Post post = postRepo.findById(id);
        return post != null ? modelMapper.map(post, PostDTO.class): null;
    }

    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public void delete(long id) {
        postRepo.delete(id);
    }

    @Override
    public Post update(long id, Post post) {
        return null;
    }

    @Override
    public List<PostDTO> searchNameByText(String text) {
        return null;
    }
}
