package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework13 {

//	13. �������� ���������, ����������� ��������� �������� ����� ����-������� ���������. 
//	��������� ��������� ������ ���������� � ��-������� ������.

	public static void main(String[] args) {

		double x, x1;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �������� �");
		double a = sc.nextDouble();
		System.out.println("������� �������� b");
		double b = sc.nextDouble();
		System.out.println("������� �������� c");
		double c = sc.nextDouble();
		double d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0)
			System.out.println("������ ���");
		else if (d == 0) {
			x = -b / (2 * a);
			System.out.println("�1 = �2 = " + x);
		} else {
			x = (-b + Math.sqrt(d)) / (2 * a);
			x1 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("�1 = " + x + ", �2 = " + x1);
		}
		sc.close();
	}

}
