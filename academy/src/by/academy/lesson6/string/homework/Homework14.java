package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework14 {

//	14. ¬вести число от 1 до 12. ¬ывести на консоль название мес€ца, соответ-ствующего данному числу.
//	(ќсуществить проверку корректности ввода чисел).

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("¬ведите целое число от 1 до 12");
			n = sc.nextInt();
		} while (n < 1 || n > 12);
		switch (n) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;

		}
		sc.close();
	}

}
