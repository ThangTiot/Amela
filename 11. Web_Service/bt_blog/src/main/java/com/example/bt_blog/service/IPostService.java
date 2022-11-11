package com.example.bt_blog.service;

import com.example.bt_blog.model.Post;
import com.example.bt_blog.service.ICRUD;

import java.util.List;

public interface IPostService extends ICRUD<Post> {
    List<Post> findAllByCategory(Long idCategory);
}
