package com.shoppingcart.mock;

import java.io.Serializable;

public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	private Cart cart;
	private String coupon;
	private boolean isNew;

	public Customer(){
		super();
	}

	public boolean getIsNew() {
		return isNew;
	}

	public void addItem(Product product, int qty) {
		cart.addItem(product, qty);
	}

	public void setDiscount(double discount){
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Customer new? ")
		   .append(isNew)
		   .append("\nCoupon: ")
		   .append(coupon)
		   .append("\n")
		   .append(cart);
		return sb.toString();
	}
}
