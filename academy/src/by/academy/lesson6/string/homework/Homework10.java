package by.academy.lesson6.string.homework;

public class Homework10 {

//	10. »спользу€ оператор switch, написать программу, котора€ выводит на экран сообщени€ о 
//	принадлежности некоторого значени€ k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k]

	public static void main(String[] args) {

		double k = -15;
		int swi = 0;

		if (k <= 0)
			swi = 1;
		else if (k > 0 && k <= 5)
			swi = 2;
		else if (k > 5 && k <= 10)
			swi = 3;
		else if (k > 10)
			swi = 4;
		switch (swi) {
		case 1:
			System.out.println("„исло " + k + " принадлежит интервалу (-10k, 0]");
			break;
		case 2:
			System.out.println("„исло " + k + " принадлежит интервалу (0, 5]");
			break;
		case 3:
			System.out.println("„исло " + k + " принадлежит интервалу (5, 10]");
			break;
		case 4:
			System.out.println("„исло " + k + " принадлежит интервалу (10, 10k]");
			break;

		}

	}

}
