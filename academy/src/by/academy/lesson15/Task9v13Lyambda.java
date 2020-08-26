package by.academy.lesson15;

/* Переделать класс использующий Printable используя ссылку на статический метод.
 * */

public class Task9v13Lyambda {

	public static void main(String[] args) {

		Printable obj = () -> Printable::print;
		obj.print("Это моя первая лямбда");

	}

}
