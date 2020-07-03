package by.academy.lesson3;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число от 1 до 10");
		int num = sc.nextInt(); 

		for (int i =1;i<=10;i++){
			System.out.println(num+"*"+i+"="+i*num);
		}
	sc.close();
	}

}
