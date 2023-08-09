package org.rishmi5h.service;

import org.rishmi5h.dto.Cart.AddToCartDto;
import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;
import org.rishmi5h.model.Users;
import org.rishmi5h.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartRepository cartRepository;

    public List<Cart> getCart() {
        return cartRepository.findAll();
    }

    public void addToCart(AddToCartDto addToCartDto, Product product) {
        Cart cart = new Cart(product, addToCartDto.getQuantity());
        cartRepository.save(cart);
    }

    public List<Cart> removeFromCart(String productId) {
        return null;
    }

    public List<Cart> updateCart(String productId, String quantity) {
        return null;
    }
}
