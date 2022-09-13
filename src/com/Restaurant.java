package com;

public class Restaurant {

	private String restaurantName;
	private long[] restaurantContact;
	private String restaurantAddress;
	private String restaurantRating;

	public Restaurant(String restaurantName, long[] restaurantContact, String restaurantAddress,
			String restaurantRating) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.restaurantRating = restaurantRating;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public long[] getRestaurantContact() {
		return restaurantContact;
	}

	public void setRestaurantContact(long[] restaurantContact) {
		this.restaurantContact = restaurantContact;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public String getRestaurantRating() {
		return restaurantRating;
	}

	public void setRestaurantRating(String restaurantRating) {
		this.restaurantRating = restaurantRating;
	}

	public void viewRestaurantDetails() {
		System.out.println("Displaying restaurant details \n***************");
		System.out.println("Restaurant Name : " + this.restaurantName);
		System.out.println("Restaurant Rating : " + this.restaurantRating);
		// Printing the different contact numbers of restaurant
		System.out.println("Restaurant Contacts : ");
		for (long contact : this.restaurantContact) {
			System.out.println(contact);
		}
		System.out.println("Restaurant Address : " + this.restaurantAddress);
		System.out.println();
	}

}
