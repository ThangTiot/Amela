package com.example.bt_blog.service.impl;

import com.example.bt_blog.model.Category;
import com.example.bt_blog.repository.ICategoryRepository;
import com.example.bt_blog.service.ICRUD;
import com.example.bt_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryService implements ICategoryService{
    @Autowired
    ICategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }
}
