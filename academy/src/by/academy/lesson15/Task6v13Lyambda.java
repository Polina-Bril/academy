package by.academy.lesson15;

import java.util.function.Consumer;

import by.academy.lesson12.HeavyBox;

public class Task6v13Lyambda {

	// Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и
	// выводит на консоль сообщение “Отгрузили ящик с весом n”. “Отправляем ящик с
	// весом n”
	// Используем функциональный интерфейс Consumer и метод по умолчанию andThen.

	public static void main(String[] args) {

		HeavyBox box = new HeavyBox(5, 5, 5, 5);
		Consumer<HeavyBox> obj1 = boxik1 -> System.out.println("Отгрузили ящик с весом n");
		Consumer<HeavyBox> obj2 = boxik2 -> System.out.println("Отправляем ящик с весом n");
		obj1.andThen(obj2).accept(box);

	}

}
