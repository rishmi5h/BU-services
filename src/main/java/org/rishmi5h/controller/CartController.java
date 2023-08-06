package org.rishmi5h.controller;

import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;
import org.rishmi5h.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/cart")
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping
    public ResponseEntity<List<Cart>> getCart() {
        List<Cart> body = cartService.getCart();
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Cart>> addToCart(@RequestBody Product product) {
        List<Cart> body = cartService.addToCart(product);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<List<Cart>> removeFromCart(@PathVariable String productId) {
        List<Cart> body =  cartService.removeFromCart(productId);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @PostMapping("/{productId}")
    public ResponseEntity<List<Cart>> updateCart(@PathVariable String productId, @RequestBody String Quantity) {
        List<Cart> body = cartService.updateCart(productId, Quantity);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
