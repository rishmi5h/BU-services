package org.example.controller;

import org.example.model.Cart;
import org.example.model.Product;
import org.example.service.CartService;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/cart")
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/")
    public Iterable<Cart> getCart() {
        return  cartService.getCart();
    }

    @PostMapping("/")
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
