package by.academy.lesson5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� ��������");

		User seller = new User();
		String s1 = sc.nextLine();
		seller.setName(s1);

		User buyer = new User();
		System.out.println("������� ��� ����������");
		String s2 = sc.nextLine();
		buyer.setName(s2);

		Product products[] = new Product [3];
		Product pr1 = new Product();
		System.out.println("������� �������� ������� ��������");
		String s3 = sc.nextLine();
		pr1.setName(s3);
		System.out.println("������� ���� ������� ��������");
		double s4 = sc.nextDouble();
		pr1.setPrice(s4);
		System.out.println("������� ���������� ������� ��������");
		int s11 = sc.nextInt();
		pr1.setPrice(s11);
		products[0] = new Product (s3, s4, s11);

		Product pr2 = new Product();
		System.out.println("������� �������� ������� ��������");
		String s5 = sc.nextLine();
		pr1.setName(s5);
		System.out.println("������� ���� ������� ��������");
		double s6 = sc.nextDouble();
		pr1.setPrice(s6);
		System.out.println("������� ���������� ������� ��������");
		int s12 = sc.nextInt();
		pr1.setPrice(s12);
		products[1] = new Product (s5, s6, s12);

		Product pr3 = new Product();
		System.out.println("������� �������� �������� ��������");
		String s7 = sc.nextLine();
		pr1.setName(s7);
		System.out.println("������� ���� �������� ��������");
		double s8 = sc.nextDouble();
		pr1.setPrice(s8);
		System.out.println("������� ���������� �������� ��������");
		int s13 = sc.nextInt();
		pr1.setPrice(s13);
		products[3] = new Product (s7, s8, s13);

		Deal deal1 = new Deal(seller, buyer, products);
		Deal deal2 = new Deal(seller, buyer, products);

		sc.close();
	}

}
