package com;

public class Tester {

	public static void main(String[] args) {
	

//		Customer customer1 = new Customer();
//		customer1.displayCustomerDetails();
		
		Customer customer1 = new Customer("C1001", "Martin", 9852361233L, "Florida, USA");
	
		customer1.displayCustomerDetails();
		
		customer1.setCustomerName("Akash Berad");
		
		customer1.displayCustomerDetails();
		
		String name = customer1.getCustomerName();
		System.out.println(name);
		
	}

}
