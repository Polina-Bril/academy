package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework3 {

//	3. ������ n ����� � �������. ������� �� ������� �� ������, ����� ������� ������ (������) �������,
//	� ����� �����.

	public static void main(String[] args) {

		int n = 3;
		String arr[] = new String[n];
		double srednee = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("������� ����� ������");
			arr[i - 1] = sc.nextLine();
			srednee += arr[i - 1].length();
		}
		srednee = srednee / n;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < srednee)
				System.out.println("\"" + arr[i] + "\". ����� ���� ������ " + arr[i].length()
						+ " ��������. ������� ����� - " + srednee);
		}
		sc.close();
	}
}
