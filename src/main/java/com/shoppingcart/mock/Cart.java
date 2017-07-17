package com.shoppingcart.mock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<CartItem> cartItems = new ArrayList<CartItem>();
    private double discount;

    public Cart() {
        super();
    }

    public void addItem(Product p, int qty) {
        CartItem cartItem = new CartItem(p, qty);
        cartItems.add(cartItem);
    }

    public double getDiscount() {
        return discount;
    }

    public void addDiscount(double discount) {
        this.discount += discount;
    }

    public void setDiscount(double discount) {
        double totalDiscount = getTotalPrice() * discount;
        this.discount += totalDiscount;
    }

    public int getTotalPrice() {
        int total = 0;
        for (CartItem item : cartItems) {
            total += item.getProduct().getPrice() * item.getQty();
        }
        return total;
    }


    public List<CartItem> getCartItems() {
        return cartItems;
    }


    public int getFinalPrice() {
        return getTotalPrice() - (int) getDiscount();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CartItem cartItem : cartItems) {
            sb.append(cartItem)
                    .append("\n");
        }
        sb.append("Discount: ")
                .append(getDiscount())
                .append("\nTotal: ")
                .append(getTotalPrice())
                .append("\nTotal After Discount: ")
                .append(getFinalPrice());
        return sb.toString();
    }
}
