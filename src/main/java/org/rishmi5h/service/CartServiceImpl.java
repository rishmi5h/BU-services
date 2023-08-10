package org.rishmi5h.service;

import org.rishmi5h.dto.Cart.AddToCartDto;
import org.rishmi5h.dto.Cart.CartDto;
import org.rishmi5h.dto.Cart.CartItemDto;
import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;
import org.rishmi5h.model.Users;
import org.rishmi5h.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;

    public CartDto getCart(Users user) {
        List<Cart> cartList = cartRepository.findAllByUserOrderByCreatedDateDesc(user);
        List<CartItemDto> cartItems = new ArrayList<>();
        for (Cart cart : cartList) {
            CartItemDto cartItemDto = getDtoFromCart(cart);
            cartItems.add(cartItemDto);
        }
        double totalCost = 0;
        for (CartItemDto cartItemDto : cartItems) {
            totalCost += (cartItemDto.getProduct().getPrice() * cartItemDto.getQuantity());
        }

        return new CartDto(cartItems, totalCost);
    }

    private CartItemDto getDtoFromCart(Cart cart) {
        return new CartItemDto(cart);
    }

    public void addToCart(AddToCartDto addToCartDto, Product product) {
        Cart cart = new Cart(product, addToCartDto.getQuantity());
        cartRepository.save(cart);
    }

    public List<Cart> removeFromCart(String productId) {
        return null;
    }

    public void updateCart(AddToCartDto updateCartDto,Users user, Product product) {
        Cart cart = cartRepository.getOne(updateCartDto.getCartId());
        cart.setQuantity(updateCartDto.getQuantity());
        cart.setCreatedDate(new Date());
        cartRepository.save(cart);
    }
}
