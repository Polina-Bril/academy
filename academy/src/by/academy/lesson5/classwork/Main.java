package by.academy.lesson5.classwork;

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

		System.out.println("������� ���������� ��������� � ������ ������");
		int n = sc.nextInt();
		Product products[] = new Product[n];
		for (int i = 0; i < products.length; i++) {
			System.out.println("������� �������� ��������");
			String s3 = sc.next();
			System.out.println("������� ���� ����� ��������");
			double s4 = sc.nextDouble();
			System.out.println("������� ����������  ����� ��������");
			int s5 = sc.nextInt();
			System.out.println("�������� ��� ��������: �������1, �������2 ��� �������3");
			String s6 = sc.next();

			if (s6.equals("�������1"))
				products[i] = new Product1(s3, s4, s5, s6);
			else if (s6.equals("�������2"))
				products[i] = new Product2(s3, s4, s5, s6);
			else if (s6.equals("�������3"))
				products[i] = new Product3(s3, s4, s5, s6);
		}
		Deal deal = new Deal(seller, buyer, products);
		deal.getBlaBlaBla();
//		deal.getSumma();

		sc.close();
	}
}
