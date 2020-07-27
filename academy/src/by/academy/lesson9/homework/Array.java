package by.academy.lesson9.homework;

//Внутренние классы. Дженерики
//10. Написать класс, который умеет хранить в себе массив любых типов данных 
//(int, long etc.). 
//Реализовать метод:
//а) который возвращает элемент по индексу (проверка границ массива)
//б) который добавляет элемент в конец массива (проверка границ массива)
//в) который добавление элемента в массив по индексу(проверка границ, сдвиг массива)
//нужно учесть, что если массив заполнен, увеличиваем массив в 2 раза

public class Array<T> {

	private T dataType;
	private T[] items;

	public Array() {
		super();
	}

	public Array(T dataType, T[] items) {
		super();
		this.dataType = dataType;
		this.items = items;
	}

	public T getDataType() {
		return dataType;
	}

	public T[] getItems() {
		return items;
	}

	public void setDataType(T dataType) {
		this.dataType = dataType;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	public int getIndex(T dataType) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == dataType) {
				return i;
			}
		}
		return -1;
	}

	void getElement(int index) {
		if (index >= items.length) {
			index = items.length - 1;
			System.out.println("В массиве нет такого элемента. Вывожу последний элемент массива");
		}
		for (int i = 0; i < items.length; i++) {
			if (i == index) {
				System.out.println(items[i]);
			}
		}
	}

	void addToEnd(T dataType, T[]items){
		 setItems(new (T getDataType) [items.length+1]);
		 this.items[items.length+1]= dataType;
		 
	 }
}
