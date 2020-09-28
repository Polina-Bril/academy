package by.academy.lesson20;

import java.util.ArrayList;
import java.util.Set;

public class Order {

	private static int forOrderNo = 0;
	private String orderNo;
	private ArrayList<OrderItem> items;

	public Order(ArrayList<OrderItem> items) {
		forOrderNo++;
		orderNo = "" + forOrderNo;
		this.items = items;
	}

	public void printOrderInfo() {
		System.out.println("Order [orderNo=" + orderNo + ", items=" + items + "]");
	}

	public int sumOfOrder() {
		int sum = 0;
		for (OrderItem ord : items) {
			sum += ord.getItemPrice() * ord.getQuantity();
		}
		return sum;
	}

}
