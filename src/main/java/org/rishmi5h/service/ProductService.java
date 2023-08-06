package org.rishmi5h.service;

import org.rishmi5h.model.Product;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Validated
public interface ProductService {

     List<Product> getAllProducts();

     Optional<Product> getProduct(Long productId);
}
