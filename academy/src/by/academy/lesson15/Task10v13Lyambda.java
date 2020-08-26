package by.academy.lesson15;

import java.util.HashMap;
import java.util.Map;

/*
 Создать программу-калькулятор, в которую мы передаем 2 числа и оператор (+,-,*,/).
	Написать свой функциональный интерфейс для вычисления.
	Использовать лямбды.
 **/

public class Task10v13Lyambda {

	static private Map<String, Calculator> catalog = new HashMap<>();
	static {
		catalog.put("+", (a, b) -> a + b);
		catalog.put("-", (a, b) -> a - b);
		catalog.put("/", (a, b) -> a / b);
		catalog.put("*", (a, b) -> a * b);
	}

	public static void main(String[] args) {

		System.out.println(catalog.get("*").calc(7, 8));

	}

}
