package by.academy.homework.homework3.task2;

public class Box<T> {

	private T[] array;
	private int counter = 0;

	@SuppressWarnings("unchecked")
	public Box() {
		super();
		array = (T[]) new Object[16];

	}

	@SuppressWarnings("unchecked")
	public Box(int size) {
		super();
		array = (T[]) new Object[size];
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
		counter = array.length;
	}

	@SuppressWarnings("unchecked")
	public void add(T item) {
		if (array == null) {
			return;
		}
		if (array.length == counter) {
			T[] temp = (T[]) new Object[array.length * 2 + 1];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}
		array[counter++] = item;

	}

	public T getItem(int index) {
		if (index < array.length && index >= 0) {
			return array[index];
		} else {
			System.out.println("ERROR!");
			return null;
		}

	}

	public T getLastItem() {
		return array[array.length - 1];
	}

	public T getFirstItem() {
		return array[0];
	}

	public void getSize() {
		System.out.println("Размер массива = " + array.length);
	}

	public void getCounter() {
		System.out.println("Индекс последнего заполненного элемента = " + (counter - 1));
	}

	@SuppressWarnings("unchecked")
	public void removeToIndex(int index) {
		if (index < 0 || index > array.length - 1) {
			return;
		} else {
			T[] temp = (T[]) new Object[array.length - 1];
			System.arraycopy(array, 0, temp, 0, index);
			System.arraycopy(array, index + 1, temp, index, array.length - index - 1);
			array = temp;
		}

		counter--;
	}

	@SuppressWarnings("unchecked")
	public void removeItem(T item) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == item) {
				T[] temp = (T[]) new Object[array.length - 1];
				System.arraycopy(array, 0, temp, 0, i);
				System.arraycopy(array, i + 1, temp, i, array.length - i - 1);
				array = temp;
				counter--;
				break;
			}

		}
	}
}
