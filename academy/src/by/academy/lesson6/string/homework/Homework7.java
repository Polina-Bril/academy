package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework7 {

//	7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов. 
//	Если таких слов несколько, найти первое из них.

	public static void main(String[] args) {

		int n = 3;
		int m;
		int a;
		String arr[] = new String[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Введите новое слово");
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
			if (a == arr[i].length()) {
				System.out.println(arr[i]);
				break;
			}
		}
		sc.close();
	}
}
