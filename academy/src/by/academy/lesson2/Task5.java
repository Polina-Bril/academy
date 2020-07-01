package by.academy.lesson2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("¬ведите первое число");
		double a = sc.nextDouble();
		System.out.println("¬ведите второе число");
		double b = sc.nextDouble();
		double c = (a+b)/2;
		if (a>b) {
			System.out.println(a+" - наибольшее, "+b+" - наименьшее");
		} else if(a==b) {
			System.out.println("„исла равны");
				} else 	{
					System.out.println(a+" - наименьшее, "+b+" - наибольшее");
					}
		System.out.println(c+" - среднее арифметическое");
		sc.close();
	}

}
