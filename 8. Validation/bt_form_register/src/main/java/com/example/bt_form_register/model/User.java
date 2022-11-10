package com.example.bt_form_register.model;

import javax.validation.constraints.*;

public class User {

    @NotBlank
    @Size(min = 5, max = 45, message = "Ten toi thieu 5 ky tu!")
    private String name;

    @NotBlank
    @Pattern(regexp = "^0+[0-9]{9}$",message = "So dien thoai khong hop le!")
    private String phoneNumber;

    @Min(value = 18,message = "Tuoi phai lon hon 18!")
    private int age;

    @NotBlank
    @Email(message = "Email khong hop le!")
    private String email;

    public User() {
    }

    public User(String name, String phoneNumber, int age, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
