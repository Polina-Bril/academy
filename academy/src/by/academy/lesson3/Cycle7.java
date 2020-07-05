package by.academy.lesson3;

import java.util.Scanner;

public class Cycle7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n;
		for (int i=0;i<10;i++) {
			System.out.println("Введите два числа через пробел");
			n = sc.nextLine();
			String dva[]=n.split(" ");
			int a = Integer.parseInt(dva[0]);
			int b = Integer.parseInt(dva[1]);
			if (a>b)
				System.out.println("Большее = "+a);
			else if (a<b)
				System.out.println("Большее = "+b);
			else 
				System.out.println("Числа равны");
		}

	}

}
