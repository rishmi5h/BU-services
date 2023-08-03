package org.rishmi5h.controller;

import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;
import org.rishmi5h.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/cart")
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping
    public String getCart() {
        return  cartService.getCart();
    }

    @PostMapping
    public Iterable<Cart> addToCart(@RequestBody Product product) {
        return  cartService.addToCart(product);
    }

    @DeleteMapping("/{productId}")
    public Iterable<Cart> removeFromCart(@PathVariable String productId) {
        return  cartService.removeFromCart(productId);
    }

    @PostMapping("/{productId}")
    public Iterable<Cart> updateCart(@PathVariable String productId, @RequestBody String Quantity) {
        return  cartService.updateCart(productId, Quantity);
    }
}
