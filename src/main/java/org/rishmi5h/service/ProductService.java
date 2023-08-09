package org.rishmi5h.service;

import org.rishmi5h.model.Product;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface ProductService {

     List<Product> getAllProducts();

     Product getProduct(Long productId);
}
