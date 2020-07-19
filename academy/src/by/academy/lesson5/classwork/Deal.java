package by.academy.lesson5.classwork;

public class Deal {

	private User seller;
	private User buyer;
	private Product[] products;

	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public double getSumma() {
		double sum = 0;
		for (Product p : products) {
			sum += p.getPrice() * p.getQuantity();
		}
		return sum;
	}

	public void getBlaBlaBla() {
		System.out.println("Покупатель - " + buyer.getName() + ", продавец - " + seller.getName()
				+ ", количество продуктов: " + products.length + ". Общая сумма сделки = " + getSumma());
	}
}
