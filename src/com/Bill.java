package com;

public class Bill {

	private static int counter;
	private String billId;
	private String paymentMode;
	
	static {
		counter = 1000;
	}

	public Bill(String paymentMode) {
		this.billId = "B"+ ++Bill.counter;
		this.paymentMode = paymentMode;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Bill.counter = counter;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", paymentMode=" + paymentMode + "]";
	}
	
	public boolean generateBill(Order order) {
		System.out.println("Bill Details \n**************************");
		System.out.println("Bill ID :"+this.getBillId());
		System.out.println("Item Ordred :");
		for(Food food : order.getOrderFoods()){
			System.out.println(food);
		}
		double payableAmount = order.calculateTotalPrice(this.getPaymentMode());
		System.out.println("Payable Amount : $"+ (payableAmount*100)/100.0);
		return true;
	}
	
}
