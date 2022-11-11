package com.example.bt_blog.service.impl;

import com.example.bt_blog.model.Post;
import com.example.bt_blog.repository.IPostRepository;
import com.example.bt_blog.service.ICRUD;
import com.example.bt_blog.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostService implements IPostService{
    @Autowired
    IPostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> findAllByCategory(Long idCategory) {
        return postRepository.findAllByCategory_Id(idCategory);
    }
}
