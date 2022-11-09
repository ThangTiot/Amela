package com.example.th3_upload_file.service;

import com.example.th3_upload_file.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    @Value("${file-upload}")
    private String fileUpload;
    private List<Product> products = new ArrayList<>();
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        int id = 1;
        if (products.size() > 0) {
            Product product1 = products.get(products.size() - 1);
            id = product1.getId() + 1;
        }
        MultipartFile file = product.getImage();
        String imageName = file.getOriginalFilename();
        product.setImageName(imageName);
        product.setId(id);
        try {
            FileCopyUtils.copy(file.getBytes(), new File(fileUpload + imageName));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        Product product1 = findById(id);
        int index = products.indexOf(product1);
        products.set(index, product);
    }

    @Override
    public void remove(int id) {
        products.remove(findById(id));
    }
}
