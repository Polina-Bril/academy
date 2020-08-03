package homework.homework2.task_1_2_6_7_8_9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Deal {

	private User seller;
	private User buyer;
	private Product[] products;
	private String deadline;

	public Deal() {
		super();
		Date now = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(now);
		c.add(Calendar.DAY_OF_MONTH, 10);
		SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy HH:mm");
		System.out.println("Дедлайн для этой сделки - " + format.format(c.getTime()));
		this.deadline = format.format(c.getTime());
	}

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		Date now = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(now);
		c.add(Calendar.DAY_OF_MONTH, 10);
		SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy HH:mm");
		System.out.println("Дедлайн для этой сделки - " + format.format(c.getTime()));
		this.deadline = format.format(c.getTime());
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

	public String getDeadline() {
		return deadline;
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

	public void menu(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Введите число, соответствующее тому, что вы хотите сделать.\nДобавить продукт - введите 1 \nУдалить продукт - введите 2 \nПодсчитать сделку - введите 3");
		int s9 = sc.nextInt();
		sc.nextLine();
		if (s9 == 1) {
			createProduct(n + 1, products);
		} else if (s9 == 2) {
			System.out.println("Введите название продукта, который надо удалить");
			String s10 = sc.next();
			delProduct(s10, products);
		} else if (s9 == 3) {
			getBlaBlaBla();
		}
		sc.close();
	}

	public void createProduct(int n, Product[] products) {

		Scanner sc = new Scanner(System.in);
		Product products1[] = new Product[n];
		for (int i = 0; i < products.length; i++) {
			products1[i] = products[i];
		}
		System.out.println("Введите название нового продукта");
		String productName = sc.nextLine();
		System.out.println("Введите цену этого продукта");
		double price = sc.nextDouble();
		System.out.println("Введите количество этого продукта");
		int quantity = sc.nextInt();
		System.out.println("Введите тип продукта: продукт1, продукт2 или продукт3");
		String type = sc.next();

		if (type.equals("продукт1")) {
			products1[n - 1] = new Product1(productName, price, quantity, type);
		} else if (type.equals("продукт2")) {
			products1[n - 1] = new Product2(productName, price, quantity, type);
		} else if (type.equals("продукт3")) {
			products1[n - 1] = new Product3(productName, price, quantity, type);
		}
		setProducts(products1);
		getBlaBlaBla();
		sc.close();
	}

	public void delProduct(String name, Product[] products) {
		Product products1[] = new Product[products.length - 1];
		int k = products.length;
		for (int i = 0; i < products1.length; i++) {
			if (products[i].name == name) {
				k = i;
				continue;
			}
			products1[i] = products[i];
		}
		if (k < products.length) {
			products1[k] = products[products.length - 1];
		}
		setProducts(products1);
		getBlaBlaBla();
	}
}
