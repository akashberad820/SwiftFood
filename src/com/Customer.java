package com;

public class Customer {

	//Attributes
	private	 String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	
		
	public Customer(String customerId, String customerName, long contactNumber, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public String getCustomerId() {
		return this.customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return this.customerName ;
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
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void displayCustomerDetails() {
		System.out.println("Displaying Customer Details \n****************************");
		System.out.println("Customer ID : "+customerId);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Contact Number: "+contactNumber);
		System.out.println("Address : "+address);
		System.out.println();
	}

	//PassByValue
	public double payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid . . . . .");
		double priceAfterDiscount = totalPrice * (1-(discountPercentage/100));
		//System.out.println("Hi "+customerName+", your final bill amount after discount is : " + (priceAfterDiscount*100)/100.0);
		return priceAfterDiscount;
	}
	
	//PassByReference
	public void updateContact(Customer cust) {
		cust.contactNumber=8208449595L;
	}
	
}
