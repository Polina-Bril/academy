package by.academy.homework.homework3.task2;

import java.util.Arrays;

public class MainForBox {

	public static void main(String[] args) {
		Box<Integer> integerArray = new Box<>();
		Double[] init = { 657.1425, 5684.0, 98.1, 150.1 };
		Box<Double> doubleArray = new Box<>();
		doubleArray.setArray(init);
		System.out.println(Arrays.toString(doubleArray.getArray()));
		System.out.println(Arrays.toString(integerArray.getArray()));
		integerArray.add(15);
		System.out.println(Arrays.toString(integerArray.getArray()));
		integerArray.add(2);
		System.out.println(Arrays.toString(integerArray.getArray()));
		integerArray.add(4);
		System.out.println(Arrays.toString(integerArray.getArray()));
		System.out.println(integerArray.getItem(2));
		System.out.println(integerArray.getItem(6));
		System.out.println(integerArray.getItem(30));
		integerArray.getSize();
		System.out.println(integerArray.getFirstItem());
		System.out.println(integerArray.getLastItem());
		integerArray.getCounter();
		doubleArray.getCounter();
		integerArray.removeItem(2);
		doubleArray.removeToIndex(2);
		System.out.println(Arrays.toString(integerArray.getArray()));
		System.out.println(Arrays.toString(doubleArray.getArray()));

	}

}
