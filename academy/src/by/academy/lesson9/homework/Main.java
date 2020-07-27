package by.academy.lesson9.homework;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Array<String> arrString = new Array<>();
		String arrayString[] = { "Мама", "Папа", "Саша", "Даша" };
		arrString.setItems(arrayString);
		System.out.println(arrString.getIndex("Саша"));
		arrString.getElement(3);
		arrString.addToEnd("Янка", arrayString);
		System.out.println(Arrays.toString(arrString.getItems()));
		arrString.addToIndex("Хто-та", arrayString, 1);
		System.out.println(Arrays.toString(arrString.getItems()));

		Array<Integer> arrInt = new Array<>();
		Integer[] arrayInt = { 10, 15, 20 };
		arrInt.setItems(arrayInt);
		System.out.println(arrInt.getIndex(10));
		arrInt.getElement(3);
		arrInt.addToEnd(14, arrayInt);
		System.out.println(Arrays.toString(arrInt.getItems()));
		arrInt.addToIndex(14, arrayInt, 0);
	}

}
