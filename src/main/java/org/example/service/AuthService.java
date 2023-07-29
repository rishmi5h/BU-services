package org.example.service;

import org.antlr.v4.runtime.misc.NotNull;
import org.example.model.Product;
import org.springframework.validation.annotation.Validated;

@Validated
public interface AuthService {

    @NotNull Iterable<Product> getAllProducts();
}
