package com.example.firstwebapp.service;

import com.example.firstwebapp.domain.Product;

import java.util.List;

public interface ProductService {

    public Boolean addProduct(Product p);

    public Boolean deleteProduct(int id);

    public Product getProduct(int id);

    public List<Product> getAllProducts();
}
