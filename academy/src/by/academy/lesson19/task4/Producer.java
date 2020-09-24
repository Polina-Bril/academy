package by.academy.lesson19.task4;

import java.util.Queue;

public class Producer implements Runnable {

	private final Queue<Integer> list;

	public Producer(Queue<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		synchronized (list) {
			while (true) {
				if (list.size() < 10) {
					for (int i = 0; i < 10; i++) {
						System.out.println("Producer adds value " + i + ". Size: " + list.size());
						list.add(i);
					}
				} else {
					System.out.println("Producer does nothing");
				}
				list.notifyAll();
				try {
					System.out.println("Producer waits");
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}