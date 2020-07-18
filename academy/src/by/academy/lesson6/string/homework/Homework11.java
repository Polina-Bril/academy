package by.academy.lesson6.string.homework;

public class Homework11 {

//	11. Используя оператор switch, написать программу, которая выводит на экран сообщения о 
//	принадлежности некоторого значения k интервалам (-10k, 5], [0, 10], [5, 15], [10, 10k].

	public static void main(String[] args) {
		double k = 5;
		int swi = 0;

		if (k < 0)
			swi = 1;
		else if (k >= 0 && k < 5)
			swi = 2;
		else if (k == 5)
			swi = 3;
		else if (k > 5 && k < 10)
			swi = 4;
		else if (k == 10)
			swi = 5;
		else if (k > 10 && k <= 15)
			swi = 6;
		else if (k > 15)
			swi = 7;
		switch (swi) {
		case 1:
			System.out.println("Число " + k + " принадлежит интервалу (-10k, 5]");
			break;
		case 2:
			System.out.println("Число " + k + " принадлежит интервалам (-10k, 5], [0, 10]");
			break;
		case 3:
			System.out.println("Число " + k + " принадлежит интервалам (-10k, 5], [0, 10], [5, 15]");
			break;
		case 4:
			System.out.println("Число " + k + " принадлежит интервалам [0, 10], [5, 15]");
			break;
		case 5:
			System.out.println("Число " + k + " принадлежит интервалам [0, 10], [5, 15], [10, 10k]");
			break;
		case 6:
			System.out.println("Число " + k + " принадлежит интервалам [5, 15], [10, 10k]");
			break;
		case 7:
			System.out.println("Число " + k + " принадлежит интервалу [10, 10k]");
			break;
		}

	}

}
