package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework2 {

//	2. ¬вести n строк с консоли. ”пор€дочить и вывести строки в пор€дке возрастани€ (убывани€)
//	значений их длины.

	public static void main(String[] args) {
		int n = 7;
		String arr[] = new String[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("¬ведите новую строку");
			arr[i - 1] = sc.nextLine();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].length() < arr[i].length()) {
					String s = arr[i];
					arr[i] = arr[j];
					arr[j] = s;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
