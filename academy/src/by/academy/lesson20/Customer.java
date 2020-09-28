package by.academy.lesson20;

import java.util.List;

public class Customer implements Payment {

	private String name;
	private Address address;
	private Order order;

	public void createOrder(Order order) {
		order = new Order(
				List.of(new OrderItem(5, 2, "Banana"), new OrderItem(2, 3, "Grape"), new OrderItem(8, 1, "Orange")));
	}

	@Override
	public boolean pay(double sum, Card card) {
		System.out.println(card);
		return card.authorise(sum);
	}

}
