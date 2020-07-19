package by.academy.lesson7.tasks;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

//	1. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество

	public static void main(String[] args) {

		String s = "Найти в строке не только запятые, но и другие знаки препинания." + "общее их количество!";

		Pattern p = Pattern.compile("[,.!?]");
		Matcher m = p.matcher(s);

		int counter = 0;
		while (m.find()) {
			counter++;
		}
		System.out.println("Counter: " + counter);

	}

}
