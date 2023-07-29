package org.example.service;

import org.example.model.Cart;
import org.example.model.Product;
import org.springframework.validation.annotation.Validated;

@Validated
public interface CartService {

    Iterable<Cart> getCart();

    Iterable<Cart> addToCart(Product product);

    Iterable<Cart> removeFromCart(String productId);

    Iterable<Cart> updateCart(String productId, String quantity);
}
