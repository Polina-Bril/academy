package by.academy.lesson5;

public class Product {
	private double price;
	private String name;
	private int quantity;
	
	public Product(){
		super();
	}
	public Product (double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public void setName (String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPrice (double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public void setQuantity (int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity () {
		return quantity;
	}

}
