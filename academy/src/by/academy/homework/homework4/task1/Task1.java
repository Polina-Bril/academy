package by.academy.homework.homework4.task1;

import java.util.Arrays;

public class Task1 {

//	Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//	Протестировать в main.

	public static void main(String[] args) {

		Integer[][] array = { { 7, 8, 11, 15, 16, 1 }, 
							{ 5, 3, 4 },
							{ 8, 11 }, 
							{ 10 }, 
							{ 15, 20, 30, 40 }, 
							{ 50, 60 },
							{ 500, 600, 800 } };
		TwoDimensionIterator<Integer> iterator = new TwoDimensionIterator<>(array);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
