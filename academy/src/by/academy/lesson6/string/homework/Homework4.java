package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework4 {
	
//	4. ������ n ���� � �������. ����� �����, � ������� ����� ��������� �������� ����������. 
//	���� ����� ���� ���������, ����� ������ �� ���.

	public static void main(String[] args) {

		int n = 3;
		int min = 1000000000;
		int m;
		int a;
		String s1 = "";
		String arr[] = new String[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("������� ����� �����");
			arr[i - 1] = sc.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			a = 0;
			for (int k = 0; k < arr[i].length(); k++) {
				m = 0;
				for (int j = k + 1; j < arr[i].length(); j++) {
					if (arr[i].charAt(k) != arr[i].charAt(j))
						m++;
				}
				if (m == arr[i].length() - 1 - k)
					a++;
			}
			if (a < min) {
				min = a;
				s1 = arr[i];
			}
		}
		System.out.println("\"" + s1 + "\". ���������� ��������� �������� � ���� ����� ���������� � ���������� " + min
				+ " ��������");
		sc.close();
	}
}
