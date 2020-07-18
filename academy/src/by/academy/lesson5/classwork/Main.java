package by.academy.lesson5.classwork;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя продавца");

		User seller = new User();
		String s1 = sc.nextLine();
		seller.setName(s1);

		User buyer = new User();
		System.out.println("Введите имя покупателя");
		String s2 = sc.nextLine();
		buyer.setName(s2);

		System.out.println("Введите количество продуктов в данной сделке");
		int n = sc.nextInt();
		Product products[] = new Product[n];
		for (int i = 0; i < products.length; i++) {
			System.out.println("Введите название продукта");
			String s3 = sc.next();
			System.out.println("Введите цену этого продукта");
			double s4 = sc.nextDouble();
			System.out.println("Введите количество  этого продукта");
			int s5 = sc.nextInt();
			System.out.println("Выберите тип продукта: продукт1, продукт2 или продукт3");
			String s6 = sc.next();

			if (s6 == "продукт1")
				products[i] = new Product1(s3, s4, s5, s6);
			else if (s6 == "продукт2")
				products[i] = new Product2(s3, s4, s5, s6);
			else if (s6 == "продукт3")
				products[i] = new Product3(s3, s4, s5, s6);
		}
		Deal deal = new Deal(seller, buyer, products);
		deal.getBlaBlaBla();

		sc.close();
	}
}
