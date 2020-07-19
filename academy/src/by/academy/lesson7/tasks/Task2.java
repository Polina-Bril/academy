package by.academy.lesson7.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	// 2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
	// учесть, что слова могут разделяться несколькими пробелами, в начале и конце
	// текста также могут быть пробелы, но могут и отсутствовать.

	public static void main(String[] args) {
		String s = " Это просто строка с   текстом. В ней надо подсчитать количество слов.   ";

		// Pattern p = Pattern.compile(" +");
		// Matcher m = p.matcher(s);
		int n = 0;
		String[] arr = s.split(" +");
		for (String a : arr) {
			System.out.println(a + " ");
			n++;
		}
		System.out.println(n-1);
	}

}
