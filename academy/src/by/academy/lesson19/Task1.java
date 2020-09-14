package by.academy.lesson19;
/*
 * Создать класс NewThread расширяющий Thread. 
Переопределить метод run(). 
В цикле for вывести на консоль символ 100 раз. 
Создать экземпляр класса и запустить новый поток.

 */

public class Task1 extends Thread {

	public static void main(String[] args) {
		Task1 thread = new Task1();
		thread.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("w" + i);
		}

	}

}
