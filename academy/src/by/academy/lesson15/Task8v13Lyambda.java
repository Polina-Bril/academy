package by.academy.lesson15;

import java.util.function.Supplier;

/*
 * Написать лямбда выражение, которое возвращает случайное число от 0 до 10. 
	Используем функциональный интерфейс Supplier.
 **/

public class Task8v13Lyambda {

	public static void main(String[] args) {

		Supplier<Double> supl = () -> Math.random() * 10;
		System.out.println(supl.get());

	}

}
