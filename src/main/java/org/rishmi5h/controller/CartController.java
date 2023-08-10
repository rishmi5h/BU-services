package org.rishmi5h.controller;

import org.rishmi5h.common.ApiResponse;
import org.rishmi5h.dto.Cart.AddToCartDto;
import org.rishmi5h.dto.Cart.CartDto;
import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;
import org.rishmi5h.model.Users;
import org.rishmi5h.service.CartService;
import org.rishmi5h.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping
    public ResponseEntity<CartDto> getCart() {
        CartDto body = cartService.getCart();
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addToCart(@RequestBody AddToCartDto addToCartDto) {
        Product product = productService.getProduct(addToCartDto.getProductId());
        cartService.addToCart(addToCartDto, product);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Added to cart"), HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{productId}")
    public ResponseEntity<List<Cart>> removeFromCart(@PathVariable String productId) {
        List<Cart> body =  cartService.removeFromCart(productId);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @PostMapping("/update/{productId}")
    public ResponseEntity<List<Cart>> updateCart(@PathVariable String productId, @RequestBody String Quantity) {
        List<Cart> body = cartService.updateCart(productId, Quantity);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
