package by.academy.lesson6.string.homework;

public class Homework12 {

//	12. Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и 
//	сверху вниз.

	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if (i % 5 == 0)
				System.out.println();
		}

	}

}
