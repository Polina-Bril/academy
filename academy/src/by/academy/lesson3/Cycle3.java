package by.academy.lesson3;

import java.util.Scanner;

public class Cycle3 {

	public static void main(String[] args) {
		System.out.println("¬ведите число!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int proizvedenie = 1;
		for (int i = 1; i < (n + 1); i++) {
			proizvedenie *= i;
		}
		System.out.println(proizvedenie);
	}

}
