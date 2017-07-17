package com.shoppingcart.mock;

import java.io.Serializable;

public class CartItem implements Serializable {
    private Product product;
    private int qty;
    private static final long serialVersionUID = 1L;

    public CartItem() {
        super();
    }

    public CartItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public String toString() {
        return product + ", qty: " + qty;
    }
}
