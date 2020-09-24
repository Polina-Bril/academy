package by.academy.lesson19.task4;

import java.util.Queue;

public class MyQueue<T extends Fruit> {
	private Queue<T> queue;
	boolean valueSet = false;

	public synchronized Queue<T> get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Получено: " + queue);
		valueSet = false;
		notify();
		return queue;
	}

	public synchronized void put(Fruit fruit) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		valueSet = true;
		this.queue = queue;
		System.out.println("Отправлено: " + queue);
		notify();
	}

	public Queue<T> getQueue() {
		return queue;
	}

	public void setQueue(Queue<T> queue) {
		this.queue = queue;
	}
	
}
