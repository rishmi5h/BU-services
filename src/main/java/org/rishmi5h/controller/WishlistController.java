package org.rishmi5h.controller;

import org.rishmi5h.model.Product;
import org.rishmi5h.model.Wishlist;
import org.rishmi5h.service.WishlistService;
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
