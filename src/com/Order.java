package com;

import java.util.Arrays;

public class Order {

	private static int counter;
	private int orderId;
	private Food[] orderFoods;
	private double totalPrice;
	private String status;
	
	
	static {
		counter = 1111;
	}
	
	
	
	public Order(Food[] orderFoods) {
		this.orderId = ++Order.counter;
		this.orderFoods = orderFoods;
	}

	public Order(Food[] orderFoods, double totalPrice, String status) {
		this.orderId = ++Order.counter;
		this.orderFoods = orderFoods;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Order.counter = counter;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Food[] getOrderFoods() {
		return orderFoods;
	}

	public void setOrderFoods(Food[] orderFoods) {
		this.orderFoods = orderFoods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderFoods=" + Arrays.toString(orderFoods) + ", totalPrice="
				+ totalPrice + ", status=" + status + "]";
	}

	public double calculateTotalPrice(String paymentMode) {
	  double price = 0;
	  for(Food food : this.orderFoods) {
		  price = price + food.getUnitPrice();
		  food.setQuantityAvailable(food.getQuantityAvailable()-1);
	  }
			return price;
	}

	public int getTotalNoOfOrder() {
		return this.orderId - 1111;
	}
}
