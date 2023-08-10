package org.rishmi5h.dto.Cart;

import java.util.List;

public class CartDto {

    private List<CartItemDto> cartItems;
    private double totalCost;


    public CartDto(List<CartItemDto> cartItems, double totalCost){
        this.cartItems = cartItems;
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public List<CartItemDto> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemDto> cartItems) {
        this.cartItems = cartItems;
    }


}
