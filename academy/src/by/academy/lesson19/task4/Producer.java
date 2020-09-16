package by.academy.lesson19.task4;

import java.util.Queue;

public class Producer <T> implements Runnable {
	private MyQueue<T>myQueue;

	public Producer(MyQueue<T> myQueue) {
		this.myQueue = myQueue;
	}

	@Override
	public void run() {
		for (T q:myQueue.getQueue()) {
			myQueue.put(q);
		}
	}

}
