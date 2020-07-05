package by.academy.lesson3;

import java.util.Scanner;

public class Cycle3 {

	public static void main(String[] args) {
		
		System.out.println("Введите число");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int proizved=1;
		for (int i=1;i<=n;i++) {
			proizved*=i;
		}
		System.out.println("Произведение чисел равно "+proizved);
		sc.close();

	}

}
