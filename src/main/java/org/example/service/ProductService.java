package org.example.service;

import org.example.model.Product;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ProductService {

     Iterable<Product> getAllProducts();

     Product getProduct(String productId);
}
