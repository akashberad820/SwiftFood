package com;

public class Tester {

	public static void main(String[] args) {

		Address add1 = new Address("D2","St.Martin", "Michigan", 423501);
		
		RegularCustomer customer1 = new RegularCustomer("Akash Berad", 8208449595L, add1);
		
		customer1.displayCustomerDetails();
		
	}

}
