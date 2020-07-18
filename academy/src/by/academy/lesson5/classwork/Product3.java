package by.academy.lesson5.classwork;

public class Product3 extends Product {
	static final double SKIDKA3 = 30;

	public Product3() {
		super();
	}

	public Product3(String name, double price, int quantity, String type) {
		super(name, quantity, type);
		this.price = price * (1 - SKIDKA3 / 100);
	}

	public void setPrice(double price) {
		this.price = price * (1 - SKIDKA3 / 100);
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

}
