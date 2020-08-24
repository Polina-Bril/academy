package by.academy.lesson14;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.File;
import java.io.PrintWriter;

import by.academy.homework.homework2.task_1_2_6_7_8_9.Product;
import by.academy.homework.homework2.task_1_2_6_7_8_9.Product1;
import by.academy.homework.homework2.task_1_2_6_7_8_9.Product2;
import by.academy.homework.homework2.task_1_2_6_7_8_9.Product3;
import by.academy.homework.homework2.task_1_2_6_7_8_9.User;

public class DealRefactor2 {

	private User seller;
	private User buyer;
	private ArrayList<Product> products;
	private String deadline;
	private String dealName;
	private String s;

	public DealRefactor2(String dealName) {
		super();
		Date now = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(now);
		c.add(Calendar.DAY_OF_MONTH, 10);
		SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy HH:mm");
		System.out.println("Дедлайн для этой сделки - " + format.format(c.getTime()));
		this.deadline = format.format(c.getTime());
		this.dealName = dealName;
	}

	public DealRefactor2(User seller, User buyer, ArrayList<Product> products, String dealName) {
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
		this.dealName = dealName;
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
		s = "Покупатель - " + buyer.getName() + ", продавец - " + seller.getName() + ". Продукты в сделке: " + products
				+ ". Общая сумма сделки = " + getSumma() + "\n";
		System.out.println(s);
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
		fileReport();
		sc.close();
	}

	public void delProduct(Product p) {
		products.remove(p);
		getBlaBlaBla();
	}

	public void fileReport() {
		File file = Path.of("academy", "src", "by", "academy", "lesson14", dealName + ".txt").toFile();
		try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
			pw.write(s);
		} catch (IOException e) {
			System.out.println("Exception");
		}
	}
}