package by.academy.lesson6.string.homework;

import java.util.Scanner;

//1. ������ n ����� � �������, ����� ����� �������� � ����� ������� ������. 
//������� ��������� ������ � �� �����.

public class Homework1 {
	public static void main(String[] args) {

		int n = 3;
		int m = 0;
		int min = 1000000000;
		int max = 0;
		String s1 = "";
		String s2 = "";
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("������� ����� ������");
			String s = sc.nextLine();
			m = s.length();
			if (m > max) {
				max = m;
				s1 = s;
			}
			if (m < min) {
				min = m;
				s2 = s;
			}
		}
		System.out.println("����� �������� ������: \"" + s2 + "\". �� ����� " + min
				+ " ��������. ����� ������� ������: \"" + s1 + "\". �� ����� " + max + " ��������.");
		sc.close();
	}
}
