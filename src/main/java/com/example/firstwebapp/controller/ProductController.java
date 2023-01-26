package com.example.firstwebapp.controller;

import com.example.firstwebapp.service.ProductService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
@Path("/v1/first-webapp")
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GET
    @Path("/product-add-status")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getStatusProductAdded()
}
