package by.academy.lesson6.string.homework;

import java.util.Scanner;

//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. 
//Вывести найденные строки и их длину.

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
			System.out.println("Введите новую строку");
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
		System.out.println("Самая короткая строка: \"" + s2 + "\". Ее длина " + min
				+ " символов. Самая длинная строка: \"" + s1 + "\". Ее длина " + max + " символов.");
		sc.close();
	}
}
