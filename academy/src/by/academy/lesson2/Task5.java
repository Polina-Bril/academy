package by.academy.lesson2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ������ �����");
		double a = sc.nextDouble();
		System.out.println("������� ������ �����");
		double b = sc.nextDouble();
		double c = (a+b)/2;
		if (a>b) {
			System.out.println(a+" - ����������, "+b+" - ����������");
		} else if(a==b) {
			System.out.println("����� �����");
				} else 	{
					System.out.println(a+" - ����������, "+b+" - ����������");
					}
		System.out.println(c+" - ������� ��������������");
		sc.close();
	}

}
