package org.rishmi5h.dto.Cart;

import org.rishmi5h.model.Cart;
import org.rishmi5h.model.Product;

public class CartItemDto {

    private Long cartId;
    private Integer quantity;
    private Product product;


    public CartItemDto(){

    }

    public CartItemDto(Cart cart) {
        this.setCartId(cart.getCartId());
        this.setQuantity(cart.getQuantity());
        this.setProduct(cart.getProduct());
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "cartId=" + cartId +
                ", quantity=" + quantity +
                ", productName=" + product.getName() +
                '}';
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }
}
