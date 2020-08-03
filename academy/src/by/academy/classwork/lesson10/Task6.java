package by.academy.classwork.lesson10;

import by.academy.lesson5.newTasks.Task8.Animal;

//Внутренние классы. Дженерики
//а) Создать обобщенный класс с тремя параметрами (T, V, K). 
//Класс содержит три переменные типа (T, V, K), конструктор, 
//принимающий на вход параметры типа (T, V, K), методы возвращающие 
//значения трех переменных. Создать метод, выводящий на консоль имена 
//классов для трех переменных класса.
//б) Наложить ограничения на параметры типа: T 
//должен реализовать интерфейс Comparable (классы-оболочки, String), 
//V должен реализовать интерфейс Serializable и расширять класс Animal, 
//K должен расширять класс Number.

public class Task6<T extends Comparable<String>, V extends Animal, Serializable, K extends Number> {
	private T item;
	private V item1;
	private K item2;

	public Task6(T item, V item1, K item2) {
		super();
		this.item = item;
		this.item1 = item1;
		this.item2 = item2;
	}

	public T getItem() {
		return item;
	}

	public V getItem1() {
		return item1;
	}

	public K getItem2() {
		return item2;
	}

	public void printItemName(T item, V item1, K item2) {
		System.out.println(item.getClass());
		System.out.println(item1.getClass());
		System.out.println(item2.getClass());
	}

}
