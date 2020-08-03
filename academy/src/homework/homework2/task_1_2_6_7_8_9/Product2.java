package homework.homework2.task_1_2_6_7_8_9;

public class Product2 extends Product {

	static final double SKIDKA2 = 50;

	public Product2() {
		super();
	}

	public Product2(String name, double price, int quantity, String type) {
		super(name, quantity, type);
		this.price = price * (1 - SKIDKA2 / 100);
	}

	public void setPrice(double price) {
		this.price = price * (1 - SKIDKA2 / 100);
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
}
