package by.academy.lesson7.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

// 2. »меетс€ строка с текстом. ѕодсчитать количество слов в тексте. ∆елательно учесть, что слова могут
//	раздел€тьс€ несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.

	public static void main(String[] args) {
		String s = " Ёто просто строка с   текстом. ¬ ней надо подсчитать количество слов.   ";
		Pattern p = Pattern.compile("[а-€ј-€A-Za-z]+");
		Matcher m = p.matcher(s);
		int count = 0;

		while (m.find()) {
			count++;
		}
		System.out.println(count);
	}
}
