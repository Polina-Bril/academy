package by.academy.homework.homework3.task3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import by.academy.homework2.dealRegExpStroki.task1_2_6_7_8_9.Product;
import by.academy.homework2.dealRegExpStroki.task1_2_6_7_8_9.Product1;
import by.academy.homework2.dealRegExpStroki.task1_2_6_7_8_9.Product2;
import by.academy.homework2.dealRegExpStroki.task1_2_6_7_8_9.Product3;
import by.academy.homework2.dealRegExpStroki.task1_2_6_7_8_9.User;

public class DealRefactor {

	private User seller;
	private User buyer;
	private ArrayList<Product> products;
	private String deadline;

	public DealRefactor() {
		super();
		Date now = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(now);
		c.add(Calendar.DAY_OF_MONTH, 10);
		SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy HH:mm");
		System.out.println("Дедлайн для этой сделки - " + format.format(c.getTime()));
		this.deadline = format.format(c.getTime());
	}

	public DealRefactor(User seller, User buyer, ArrayList<Product> products) {
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

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
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
				+ ". Продукты в сделке: " + products + ". Общая сумма сделки = " + getSumma());
	}

	public void menu(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Введите число, соответствующее тому, что вы хотите сделать.\nДобавить продукт - введите 1 \nУдалить продукт - введите 2 \nПодсчитать сделку - введите 3");
		int s9 = sc.nextInt();
		sc.nextLine();
		if (s9 == 1) {
			createProduct();
		} else if (s9 == 2) {
			System.out.println("Введите название продукта, который надо удалить");
			String s10 = sc.nextLine();
			for (Product p : products) {
				if (p.getName().equals(s10)) {
					delProduct(p);
					break;
				}
			}
		} else if (s9 == 3) {
			getBlaBlaBla();
		}
		sc.close();
	}

	public void createProduct() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите название нового продукта");
		String productName = sc.nextLine();
		System.out.println("Введите цену этого продукта");
		double price = sc.nextDouble();
		System.out.println("Введите количество этого продукта");
		int quantity = sc.nextInt();
		System.out.println("Введите тип продукта: продукт1, продукт2 или продукт3");
		String type = sc.next();

		if (type.equals("продукт1")) {
			products.add(new Product1(productName, price, quantity, type));
		} else if (type.equals("продукт2")) {
			products.add(new Product2(productName, price, quantity, type));
		} else if (type.equals("продукт3")) {
			products.add(new Product3(productName, price, quantity, type));
		}
		getBlaBlaBla();
		sc.close();
	}

	public void delProduct(Product p) {
		products.remove(p);
		getBlaBlaBla();
	}
}
