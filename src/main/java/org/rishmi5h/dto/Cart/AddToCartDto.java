package org.rishmi5h.dto.Cart;

import jakarta.validation.constraints.NotNull;

public class AddToCartDto {
    private Long cartId;
    private @NotNull Long productId;
    private @NotNull Integer quantity;

    public AddToCartDto(){

    }

    @Override
    public String toString(){
        return "CartDto{" +
                "cartId=" + cartId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ",";
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

