package by.academy.homework2.dealRegExpStroki.task1_2_6_7_8_9;

public class Product1 extends Product {

	static final double SKIDKA1 = 10;

	public Product1() {
		super();
	}

	public Product1(String name, double price, int quantity, String type) {
		super(name, quantity, type);
		this.price = price * (1 - SKIDKA1 / 100);
	}

	public void setPrice(double price) {
		this.price = price * (1 - SKIDKA1 / 100);
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
}
