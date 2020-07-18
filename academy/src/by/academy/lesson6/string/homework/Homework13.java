package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework13 {

//	13. Написать программу, позволяющую корректно находить корни квад-ратного уравнения. 
//	Параметры уравнения должны задаваться с ко-мандной строки.

	public static void main(String[] args) {

		double x, x1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение а");
		double a = sc.nextDouble();
		System.out.println("Введите значение b");
		double b = sc.nextDouble();
		System.out.println("Введите значение c");
		double c = sc.nextDouble();
		double d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0)
			System.out.println("Корней нет");
		else if (d == 0) {
			x = -b / (2 * a);
			System.out.println("х1 = х2 = " + x);
		} else {
			x = (-b + Math.sqrt(d)) / (2 * a);
			x1 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("х1 = " + x + ", х2 = " + x1);
		}
		sc.close();
	}

}
