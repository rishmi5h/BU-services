package org.rishmi5h.service;

import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

    public String getCart() {
        return "rishabh";
    }

    public Iterable<Cart> addToCart(Product product) {
        return null;
    }

    public Iterable<Cart> removeFromCart(String productId) {
        return null;
    }

    public Iterable<Cart> updateCart(String productId, String quantity) {
        return null;
    }
}
