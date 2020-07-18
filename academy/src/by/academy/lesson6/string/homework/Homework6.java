package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework6 {

//	6. Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания
//	их кодов. Если таких слов несколько, найти первое из них.

	public static void main(String[] args) {
		int n = 3;
		int vozrastaet;
		String arr[] = new String[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("Введите новое слово");
			arr[i - 1] = sc.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			vozrastaet = 0;
			for (int k = 0; k < arr[i].length() - 1; k++) {
				if (arr[i].charAt(k) < arr[i + 1].charAt(k))
					vozrastaet++;
			}
			if (vozrastaet == arr[i].length() - 1) {
				System.out.println(arr[i]);
				break;
			} else if (i == n)
				System.out.println(
						"Здесь нет слова, символы в котором идут в строго возрастающей последовательности их кодов");
		}
		sc.close();
	}
}
