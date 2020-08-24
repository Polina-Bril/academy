package by.academy.lesson15;

import java.util.function.Predicate;

public class Task2v13Lyambda {

	// Создать лямбда выражение, которое возвращает значение true, если строка не
	// null, используя функциональный интерфейс Predicate

	public static void main(String[] args) {
		String s = null;
		Predicate<String> obj = str -> str != null;
		System.out.println(obj.test(s));

	}

}
