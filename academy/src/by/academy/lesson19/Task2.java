package by.academy.lesson19;
/*
 * Создать класс, реализующий интерфейс Runnable. 
Переопределить run() метод. Создать цикл for. 
В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка. 
Используем статический метод Thread.sleep() чтобы сделать паузу. 
Создать три потока, выполняющих задачу распечатки значений.
 */

public class Task2 implements Runnable {

	private String name;

	public Task2(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i + " " + name);
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread threadA = new Thread(new Task2("A"));
		Thread threadB = new Thread(new Task2("B"));
		Thread threadC = new Thread(new Task2("C"));
		threadA.start();
		threadB.start();
		threadC.start();
	}
}
