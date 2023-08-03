package org.rishmi5h.service;

import org.rishmi5h.model.Product;
import org.rishmi5h.model.Wishlist;
import org.springframework.validation.annotation.Validated;

@Validated
public interface WishlistService {

    Wishlist getWishlist();

    Wishlist addToWishlist(Product product);

    Wishlist deleteFromWishlist(String productId);

}
