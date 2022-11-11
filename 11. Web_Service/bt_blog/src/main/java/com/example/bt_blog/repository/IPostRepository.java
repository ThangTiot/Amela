package com.example.bt_blog.repository;

import com.example.bt_blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllByCategory_Id(Long id);
}
