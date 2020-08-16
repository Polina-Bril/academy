package by.academy.lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {

//	Создать список оценок учеников с помощью ArryList, заполнить случайными
//	оценками. Найти самую высокую оценку с использованием итератора.

	public static void main(String[] args) {

		List<Integer> estimation = new ArrayList<>();
		for (int i = 1; i <= 30; i++) {
			estimation.add((int) (Math.random() * 10 + 1));
		}
		System.out.println(estimation);
		Iterator<Integer> iterator = estimation.iterator();
		Integer max = estimation.get(0);
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			if (next > max) {
				max = next;
			}
		}
		System.out.println("Самая высокая оценка = "+max);

	}

}
