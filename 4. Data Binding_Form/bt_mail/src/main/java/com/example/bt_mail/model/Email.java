package com.example.bt_mail.model;

public class Email {
    private String language;
    private int size;
    private String signature;

    public Email() {
    }

    public Email(String language, int size, String signature) {
        this.language = language;
        this.size = size;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
