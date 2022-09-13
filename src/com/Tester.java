package com;

public class Tester {

	public static void main(String[] args) {

//		Customer customer1 = new Customer("Sam", 9945000009L, "Carolina Street, Springfield, 62702");
//		Customer customer2 = new Customer("John", 9645000009L, "Carolina Street, Springfield, 62708");
//		Customer customer3 = new Customer("Alex", 9745000009L, "Carolina Street, Springfield, 62768");
	
//		Bill bill1 = new Bill("Paypal");
//		Bill bill2 = new Bill("BharatPay");
//		Bill bill3 = new Bill("PhonePay");

		Food food1 = new Food("Pizza","Indian","Veg",10 ,100.00);
		Food food2 = new Food("Burger","Indian","Veg",10 ,100.00);
		
		Food[] orderFood = {food1, food2};
		
		Order order1 = new Order(orderFood, 1000, "Ordered");
		
		System.out.println(order1.toString());
		
	}

}
