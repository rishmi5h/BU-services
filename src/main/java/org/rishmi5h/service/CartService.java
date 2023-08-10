package org.rishmi5h.service;

import org.rishmi5h.dto.Cart.AddToCartDto;
import org.rishmi5h.dto.Cart.CartDto;
import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;
import org.rishmi5h.model.Users;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface CartService {

    CartDto getCart(Users user);

    void addToCart(AddToCartDto addToCartDto, Product product);

    List<Cart> removeFromCart(String productId);

    void updateCart(AddToCartDto updateCartDto,Users user, Product product);
}
