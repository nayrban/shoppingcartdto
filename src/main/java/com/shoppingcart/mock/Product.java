package com.shoppingcart.mock;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    private int price;
    private String desc;

    public Product() {
        super();
    }

    public Product(String desc, int price) {
        this.desc = desc;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public String toString() {
        return "product: " + desc + ", price: " + price;
    }
}
