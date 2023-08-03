package org.rishmi5h.service;

import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;
import org.springframework.validation.annotation.Validated;

@Validated
public interface CartService {

   String getCart();

    Iterable<Cart> addToCart(Product product);

    Iterable<Cart> removeFromCart(String productId);

    Iterable<Cart> updateCart(String productId, String quantity);
}
