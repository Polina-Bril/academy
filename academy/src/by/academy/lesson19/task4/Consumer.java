package by.academy.lesson19.task4;

import java.util.Queue;

public class Consumer implements Runnable {
	private final Queue<Integer> list;

	public Consumer(Queue<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		synchronized (list) {
			while (true) {
				if (!list.isEmpty()) {
					for (int i = 0; i < 100; i++) {
						Integer removedValue = list.remove();
						System.out.println("Consumer get value: " + removedValue + ". Size: " + list.size());
					}
				} else {
					System.out.println("Consumer is waiting. Queue is empty");
				}
				try {
					System.out.println("Consumer waits");
					list.notifyAll();
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
