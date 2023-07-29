package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    private ProductService productService;

    public AuthController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/signup")
    public Iterable<Product> getProducts() {
        return  productService.getAllProducts();
    }

}
