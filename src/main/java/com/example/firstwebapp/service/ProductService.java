package com.example.firstwebapp.service;

import com.example.firstwebapp.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    public List<Product> getProduct(){
        return List.of(
                new Product("Nintendo Switch",
                        500,
                        "A very nice Nintendo Switch",
                        "243X5CF7D",
                        5
                )
        );
    }

    public List<Product> addProduct(){
        return null;
    }
}
