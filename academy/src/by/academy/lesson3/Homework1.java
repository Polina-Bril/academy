package by.academy.lesson3;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ������� � ��������");
		int money = sc.nextInt();
		System.out.println("������� ������� ����������");
		int age = sc.nextInt();
	
		if (money<100)
			System.out.println("������������� ���� "+money*0.95);
			else if (money<200)
				System.out.println("������������� ���� "+money*0.93);
			else if (money<300) {
					if (age>18)
						System.out.println("������������� ���� "+money*0.84);
					else System.out.println("������������� ���� "+money*0.91);
					}
			else if (money<400)
				System.out.println("������������� ���� "+money*0.85);
			else System.out.println("������������� ���� "+money*0.8);
	sc.close();
	}

}
