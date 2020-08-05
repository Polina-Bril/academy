package by.academy.homework.homework3.task3;

import java.util.ArrayList;
import java.util.Scanner;

import by.academy.homework.homework2.task_1_2_6_7_8_9.User;
import by.academy.homework.homework2.Task3;
import by.academy.homework.homework2.task_1_2_6_7_8_9.BelarusPhoneValidator;
import by.academy.homework.homework2.task_1_2_6_7_8_9.EmailValidator;
import by.academy.homework.homework2.task_1_2_6_7_8_9.Product1;
import by.academy.homework.homework2.task_1_2_6_7_8_9.Product2;
import by.academy.homework.homework2.task_1_2_6_7_8_9.Product3;
import by.academy.homework.homework2.task_1_2_6_7_8_9.Product;

public class MainRefactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя продавца");
		User seller = new User();
		String s1 = sc.nextLine();
		seller.setName(s1);

		do {
			System.out.println("Введите дату рождения продавца  формате dd/MM/yyyy или dd-MM-yyyy");
			String s3 = sc.nextLine();
			boolean isValid = Task3.isValidDateString(s3);
			seller.setDateOfBirth(s3);
			if (isValid == true) {
				break;
			} else {
				System.out.println("Дата введена неверно.");
			}
		} while (true);

		do {
			System.out.println("Введите телефон продавца");
			String s5 = sc.nextLine();
			boolean isValid = BelarusPhoneValidator.validate(s5);
			seller.setPhone(s5);
			if (isValid == true) {
				break;
			} else {
				System.out.println("Телефон введен неверно.");
			}
		} while (true);
		do {
			System.out.println("Введите email продавца");
			String s6 = sc.nextLine();
			boolean isValid = EmailValidator.validate(s6);
			seller.setEmail(s6);
			if (isValid == true) {
				break;
			} else {
				System.out.println("Email введен неверно.");
			}
		} while (true);

		User buyer = new User();
		System.out.println("Введите имя покупателя");
		String s2 = sc.nextLine();
		buyer.setName(s2);

		do {
			System.out.println("Введите дату рождения покупателя в  формате dd/MM/yyyy или dd-MM-yyyy");
			String s4 = sc.nextLine();
			boolean isValid = Task3.isValidDateString(s4);
			buyer.setDateOfBirth(s4);
			if (isValid == true) {
				break;
			} else {
				System.out.println("Дата введена неверно.");
			}
		} while (true);
		do {
			System.out.println("Введите телефон покупателя");
			String s7 = sc.nextLine();
			boolean isValid = BelarusPhoneValidator.validate(s7);
			buyer.setPhone(s7);
			if (isValid == true) {
				break;
			} else {
				System.out.println("Телефон введен неверно.");
			}
		} while (true);
		do {
			System.out.println("Введите email покупателя");
			String s8 = sc.nextLine();
			boolean isValid = EmailValidator.validate(s8);
			buyer.setEmail(s8);
			if (isValid == true) {
				break;
			} else {
				System.out.println("Email введен неверно.");
			}
		} while (true);

		System.out.println("Введите количество продуктов в данной сделке");
		int n = sc.nextInt();
		ArrayList<Product> products = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Введите название продукта");
			String productName = sc.next();
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
		}
		DealRefactor deal = new DealRefactor(seller, buyer, products);
		deal.getBlaBlaBla();
		deal.menu(n);
		sc.close();
	}

}
