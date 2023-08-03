package org.rishmi5h.service;

import org.rishmi5h.model.Product;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ProductService {

     Iterable<Product> getAllProducts();

     Product getProduct(String productId);
}
