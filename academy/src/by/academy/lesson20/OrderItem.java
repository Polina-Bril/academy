package by.academy.lesson20;

public class OrderItem {

	private double itemPrice;
	private int quantity;
	private String name; 
	
	public OrderItem(double itemPrice, int quantity, String name) {
		super();
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.name = name;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "OrderItem [itemPrice=" + itemPrice + ", quantity=" + quantity + ", name=" + name + "]";
	}
	

}
