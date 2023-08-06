package org.rishmi5h.controller;

import org.rishmi5h.model.Product;
import org.rishmi5h.model.Wishlist;
import org.rishmi5h.service.WishlistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Wishlist> addToWishlist(Product product) {
        Wishlist body =  wishlistService.addToWishlist(product);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Wishlist> deleteFromWishlist(@PathVariable String productId) {
        Wishlist body =  wishlistService.deleteFromWishlist(productId);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
