package by.academy.lesson15;

import java.util.function.Predicate;

public class Task5v13Lyambda {

	// Написать программу которая проверяет, что строка начинается буквой “J”или “N”
	// и заканчивается “A”. Используем функциональный интерфейс Predicate

	public static void main(String[] args) {
		String s = "Iot foundA";
		Predicate<String> obj = str -> str.endsWith("A") && (str.startsWith("J") || str.startsWith("N"));
		System.out.println(obj.test(s));

	}

}
