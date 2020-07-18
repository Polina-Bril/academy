package by.academy.lesson6.string.homework;

import java.util.Scanner;

public class Homework5 {

//	5. ¬вести n слов с консоли. Ќайти количество слов, содержащих только символы латинского алфавита,
//	а среди них Ц количество слов с равным числом гласных и согласных букв.

	public static void main(String[] args) {
		int n = 3;
		int latinskieCount;
		int latinskoeSlovo = 0;
		int glasnyeCount;
		int glasnyeSoglasnye = 0;
		String arr[] = new String[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("¬ведите новое слово");
			arr[i - 1] = sc.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			latinskieCount = 0;
			glasnyeCount = 0;
			for (int k = 0; k < arr[i].length(); k++) {
				char s = arr[i].charAt(k);
				if ((s >= 65 && s <= 90) || (s >= 97 && s <= 122)) {
					latinskieCount++;
					if (s == 65 || s == 69 || s == 73 || s == 79 || s == 85 || s == 89 || s == 97 || s == 101
							|| s == 105 || s == 111 || s == 117 || s == 121)
						glasnyeCount++;
				}
			}
			if (latinskieCount == arr[i].length()) 
				latinskoeSlovo++;
			if (glasnyeCount == arr[i].length() - glasnyeCount)
				glasnyeSoglasnye++;
		}
		System.out.println("—реди введенных слов имеетс€ " + latinskoeSlovo
				+ " слова, которые содержат только символы латинского алфавита.\n—реди них количество слов с равным числом гласных и согласных букв равно "
				+ glasnyeSoglasnye);
		sc.close();
	}
}
