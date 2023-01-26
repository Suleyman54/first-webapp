package com.example.firstwebapp.domain;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", barcode='" + barcode + '\'' +
                ", score=" + score +
                '}';
    }
}
