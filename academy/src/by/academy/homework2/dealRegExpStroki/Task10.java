package by.academy.homework2.dealRegExpStroki;

import java.util.Scanner;

public class Task10 {

//	10. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. 
//	Если таких слов несколько, найти первое из них.

	public static void main(String[] args) {

		int n = 3;
		int min = 1000000000;
		int m;
		int a;
		String s1 = "";
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
			if (a < min) {
				min = a;
				s1 = arr[i];
			}
		}
		System.out.println("\"" + s1 + "\". Количество различных символов в этом слове минимально и составляет " + min
				+ " символов");
		sc.close();
	}
}
