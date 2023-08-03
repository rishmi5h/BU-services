package org.example.controller;

import org.example.model.Product;
import org.example.model.Wishlist;
import org.example.service.WishlistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/wishlist")
public class WishlistController {

    private final WishlistService wishlistService;

    public WishlistController(WishlistService wishlistService){
        this.wishlistService = wishlistService;
    }

    @GetMapping
    public Wishlist getWishlist() {
        return wishlistService.getWishlist();
    }

    @PostMapping
    public Wishlist addToWishlist(Product product) {
        return wishlistService.addToWishlist(product);
    }

    @DeleteMapping("/{productId}")
    public Wishlist deleteFromWishlist(@PathVariable String productId) {
        return wishlistService.deleteFromWishlist(productId);
    }
}
