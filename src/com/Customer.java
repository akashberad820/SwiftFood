package com;

public class Customer {

	// Attributes
	private static int counter;
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
	private static float deliveryCharges;

	static {
		deliveryCharges = 1.5f;
		counter = 100;
	}

	public Customer(String customerName, long contactNumber, Address address) {
		this.customerId = "C" + ++Customer.counter;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Customer.counter = counter;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayCustomerDetails() {
		System.out.println("Displaying Customer Details \n****************************");
		System.out.println("Customer ID : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}

	// PassByValue
	public double payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid . . . . .");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		return priceAfterDiscount + deliveryCharges;
	}

	// PassByReference
	public void updateContact(Customer cust) {
		cust.contactNumber = 8208449595L;
	}

}
