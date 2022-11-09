package com.example.th3_upload_file.model;

import org.springframework.web.multipart.MultipartFile;

public class Product {
    private int id;

    private String name;

    private String description;

    private String imageName;

    private MultipartFile image;

    public Product() {
    }

    public Product(int id, String name, String description, String imageName, MultipartFile image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageName = imageName;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
