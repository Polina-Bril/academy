package by.academy.lesson15;

public class Task1v13Lyambda {

	// Написать лямбда выражение для интерфейса Printable, который содержит один
	// метод void print().

	public static void main(String[] args) {

		Printable obj = () -> System.out.println("Это моя первая лямбда");
		obj.print();

	}

}
