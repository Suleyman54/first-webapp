package com.example.firstwebapp.domain;

import lombok.Data;

@Data
public class Product {

    private String name;
    private int price;
    private String description;
    private String barcode;
    private int score;

    public Product(String name, int price, String description, String barcode, int score) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.barcode = barcode;
        this.score = score;
    }
}
