package com;

public class Tester {

	public static void main(String[] args) {
	
		long[] contacts = {100L, 180L, 1299L};
		Restaurant restaurant1  = new Restaurant("Hotel Sandeep", contacts, "USA", "4.5");
	
		restaurant1.viewRestaurantDetails();
		
		System.out.println("Hello "+args[0]);
	}

}
