package by.academy.lesson15;

import java.util.function.Predicate;

public class Task4v13Lyambda {

	// Написать программу проверяющую, что строка не null и не пуста, используя
	// метод and() функционального интерфейса Predicate.

	public static void main(String[] args) {
		String s = null;
		Predicate<String> notNull = str -> str != null;
		Predicate<String> notEmpty = str -> !str.isEmpty();
		System.out.println(notNull.and(notEmpty).test(s));

	}

}
