package by.academy.lesson4;

public class Product {

	// public int discount;
	private String name;
	private int shtuk;
	private double price;

	public Product(String name, double price, int shtuk, int discount) {
		super();
		this.name = name;
		this.price = price;
		this.shtuk = shtuk;
	}

	public double getPrice() {
		return price * shtuk / 10 * (100 - getDiscount());
	}

	public void setPrice() {
		this.price = price;
	}

	private int getDiscount() {
		return 10;
	}

	// public void setDiscount () {
	// this.discount=discount;
	// }

	public int getShtuk() {
		return shtuk;
	}

	public void setShtuk() {
		this.shtuk = shtuk;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	// private double getSkidka () {
	// return 10;

	// }
	// protected int cena () {
	// return shtuk*price;
	// }
	// private void infoToScreen () {
	// }
}
