package com.shoppingcart.mock;

import java.io.Serializable;

@org.kie.api.definition.type.Description("Customer class for Shopping Cart")
@org.kie.api.definition.type.Label("Customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private Cart cart;
    private String coupon;
    private String customerType;
    private boolean isNew;

    public Customer() {
        super();
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void addItem(Product product, int qty) {
        cart.addItem(product, qty);
    }

    public void setDiscount(double discount) {
        cart.setDiscount(discount);
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public Cart getCart() {
        return cart;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cart=" + cart +
                ", coupon='" + coupon + '\'' +
                ", customerType='" + customerType + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
