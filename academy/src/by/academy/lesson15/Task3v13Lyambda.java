package by.academy.lesson15;

import java.util.function.Predicate;

public class Task3v13Lyambda {

	// Создать лямбда выражение, которое проверяет, что строка не пуста, используя
	// функциональный интерфейс Predicate.

	public static void main(String[] args) {
		String s = "k";
		Predicate<String> obj = str -> str != null && !str.isEmpty();
		System.out.println(obj.test(s));

	}

}
