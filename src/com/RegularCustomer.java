package com;

public class RegularCustomer extends Customer {

	private float discount;

	public RegularCustomer(String customerName, long contactNumber, Address address) {
		super(customerName, contactNumber, address);
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

}
