package by.academy.lesson19.task4;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Изменить MyQueue:
a) Вместо int n добавить Queue<T> (MyQueue сделать обобщенным), которая будет содержать объекты 
создаваемые Producer. 
б) Добавьте еще один объект Consumer, который будет запускаться тоже отдельным потоком. 
в) Выводите на консоль какой из объектов Consumer обработал объект из очереди. 
г) Измените цикл for на бесконечный цикл.
 */

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		Queue <Integer> queue = new LinkedList<>();
		Thread producerThread = new Thread(new Producer(queue));
		Thread consumerThread = new Thread(new Consumer(queue));
		
		producerThread.start();
		consumerThread.start();

		producerThread.join();
		consumerThread.join();
	}

}
