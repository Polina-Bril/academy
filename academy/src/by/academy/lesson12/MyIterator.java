package by.academy.lesson12;

import java.util.Iterator;

//11.Collections Задание 3. Написать итератор по массиву. (Отдельный класс. 
//Наследуемся от Iterator<T>). Протестировать в main.

public class MyIterator <T>implements Iterator<T> {
	
	private T[]array;
	private int counter;
	
	public MyIterator(T []array) {
		super();
		this.array=array;
	}

	@Override
	public boolean hasNext() {
		return this.array!=null&&this.array.length>counter&&array[counter]!=null;
			}

	@Override
	public T next() {
		return array[counter++];
	}

}
