package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework15 {

//	15. ������� �����: ������ 2 �����, ��������� �� ������� ����� ����. �������� ����� ��������� ��
//	������ �������� ������� ����� � ������ �������� ������� �����.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[2];
		for (int i = 0; i < arr.length; i++) {
			do {
				System.out.println("������� �����, ��������� �� ������� ����� ����");
				arr[i] = sc.nextLine();
			} while (arr[i].length() % 2 != 0);
		}
		String s = arr[0].substring(0, arr[0].length() / 2) + arr[1].substring(arr[1].length() / 2, arr[1].length());
		System.out.println(s);
		sc.close();
	}
}