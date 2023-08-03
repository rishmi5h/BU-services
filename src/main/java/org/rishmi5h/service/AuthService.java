package org.rishmi5h.service;

import org.antlr.v4.runtime.misc.NotNull;
import org.rishmi5h.model.Product;
import org.springframework.validation.annotation.Validated;

@Validated
public interface AuthService {

    @NotNull Iterable<Product> getAllProducts();
}
