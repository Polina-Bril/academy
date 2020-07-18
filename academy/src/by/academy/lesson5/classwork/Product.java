package by.academy.lesson5.classwork;

public class Product {
	protected double price;
	protected String name;
	protected int quantity;
	protected String type;

	public Product() {
		super();
	}

	public Product(String name, double price, int quantity, String type) {
		super();
		this.price = price;
		this.name = name;
		this.quantity = quantity;
		this.type = type;

	}

	public Product(String name, int quantity, String type) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
