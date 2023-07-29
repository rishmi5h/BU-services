package org.example.service;

import org.example.model.Product;
import org.example.model.Wishlist;
import org.springframework.validation.annotation.Validated;

@Validated
public interface WishlistService {

    Wishlist getWishlist();

    Wishlist addToWishlist(Product product);

    Wishlist deleteFromWishlist(String productId);

}
