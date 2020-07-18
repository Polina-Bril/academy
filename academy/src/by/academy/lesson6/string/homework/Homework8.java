package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework8 {

//	8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром. 
//	Если таких слов больше одного, найти второе из них.

	public static void main(String[] args) {
		int n = 5;
		int chisloCount;
		int chisloSlovo = 0;
		int palindrom;
		String s1 = "";
		String arr[] = new String[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Введите новое слово");
			arr[i - 1] = sc.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			chisloCount = 0;
			palindrom = 0;
			for (int k = 0; k < arr[i].length(); k++) {
				char s = arr[i].charAt(k);
				if (s >= 48 && s <= 57) {
					chisloCount++;
					if (s == arr[i].charAt(arr[i].length() - 1 - k))
						palindrom++;
				}
			}
			if (chisloCount == arr[i].length() && palindrom == arr[i].length()) {
				chisloSlovo++;
				if (chisloSlovo == 1)
					s1 = arr[i];
				if (chisloSlovo == 2)
					s1 = arr[i];
			}
		}
		System.out.println(s1);
		sc.close();
	}
}
