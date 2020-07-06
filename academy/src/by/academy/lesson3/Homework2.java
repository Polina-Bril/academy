package by.academy.lesson3;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите тип данных");
		String type = sc.nextLine();
		System.out.println("¬ведите переменную");
	
		switch (type) {
		case "int":
			int variable = sc.nextInt();
			System.out.print(variable%2);
			break;
		case "double":
			double variable1 = sc.nextDouble();
			System.out.print(variable1*0.7);
			break;
		case "float":
			float variable2 = sc.nextFloat();
			System.out.print(variable2*variable2);
			break;
		case "char":
			String variable3= sc.nextLine();
			for (int i = 0; i < variable3.length(); i++) {
				  System.out.println((int) variable3.charAt(i));
				}
			break;
		case "String":
			String variable4 = sc.nextLine();
			System.out.print("Hello "+variable4);
			break;
		default:
			System.out.print("Unsupported type");
		}
	sc.close();

	}
}
