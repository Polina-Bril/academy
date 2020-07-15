package by.academy.lesson5.classwork;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите им€ продавца");

		User seller = new User();
		String s1 = sc.nextLine();
		seller.setName(s1);

		User buyer = new User();
		System.out.println("¬ведите им€ покупател€");
		String s2 = sc.nextLine();
		buyer.setName(s2);
		
		System.out.println("¬ведите количество продуктов в данной сделке");
		int n = sc.nextInt();
		Product products[] = new Product [n];
		for (int i=0;i<products.length;i++) {
		System.out.println("¬ведите название продукта");
		String s3 = sc.next();
		System.out.println("¬ведите цену этого продукта");
		double s4 = sc.nextDouble();
		System.out.println("¬ведите количество  этого продукта");
		int s5 = sc.nextInt();
		System.out.println("¬ыберите тип продукта: продукт1, продукт2 или продукт3");
		String s6 = sc.next();
		do {
			if (s6=="продукт1")
			products[i] = new Product1 (s3, s4, s5, s6);
		else if (s6=="продукт2")
			products[i] = new Product2 (s3, s4, s5, s6);
		else if s6=="продукт3")
		products[i] = new Product3 (s3, s4, s5, s6);
		else System.out.println("¬ведите тип продукта правильно");
		}while (s6=="продукт2"||s6=="продукт2"||s6=="продукт3");
		}
		Deal deal = new Deal(seller, buyer, products);
		deal.getBlaBlaBla();
	
		sc.close();
	}
}
