package by.academy.lesson3;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первую строку");
		String stroka1 = sc.nextLine();
		System.out.println("Введите вторую строку");
		String stroka2 = sc.nextLine();
		int n = 0;
		int m = 0;
		char symbol1;
		char symbol2;
		if (stroka1.length()==stroka2.length()) {
			for (int i=0;i<stroka1.length();i++) {
				symbol1 = stroka1.charAt(i);
				for (int j=0;j<stroka2.length();j++) {
					symbol2=stroka2.charAt(j);
					if (symbol2==symbol1) {
						n++;
						break;
					}
				}
			}
			for (int i=0;i<stroka2.length();i++) {
				symbol1 = stroka2.charAt(i);
				for (int j=0;j<stroka1.length();j++) {
					symbol2=stroka1.charAt(j);
					if (symbol2==symbol1) {
						m++;
						break;
					}
				}
			}
			if (n==stroka1.length()&&m==stroka1.length())
				System.out.println("Одна строка является перестановкой символов другой строки");
			else
				System.out.println("Одна строка НЕ является перестановкой символов другой строки");
			}
		else System.out.println("Одна строка НЕ является перестановкой символов другой строки");
				
		sc.close();
	}

}
