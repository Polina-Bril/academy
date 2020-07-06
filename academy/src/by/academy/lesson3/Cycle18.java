package by.academy.lesson3;

import java.util.Scanner;

public class Cycle18 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Задайте натуральное число N");
		int n= sc.nextInt();
		int k=0;
		int s=0;
			for (int i =0;i<=n;i++) {
			if (i%2==0||i%3==0||i%5==0)
				s++;
			else 
				k++;
		}
		System.out.println("Количество натуральных чисел = "+k);
		sc.close();
	}

}
