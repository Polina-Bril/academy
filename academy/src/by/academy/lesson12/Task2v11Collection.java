package by.academy.lesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2v11Collection {

//	Можно писать все в main. Не нужно создавать новых классов.
//	Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//	Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
//	Замерьте время, которое потрачено на это. 
//	Сравните результаты и предположите, почему они именно такие.

	public static void main(String[] args) {
		long arrayStart= System.currentTimeMillis();
		List<Integer> arrayList = new ArrayList<Integer>();
		addToList(arrayList);
		choseElement(arrayList);
		long arrayEnd= System.currentTimeMillis();
		List<Integer> linkedList = new LinkedList<Integer>();
		addToList(linkedList);
		choseElement(arrayList);
		long linkedEnd= System.currentTimeMillis();
		long a=arrayEnd-arrayStart;
		long b= linkedEnd-arrayEnd;
		
		System.out.println(a);
		System.out.println(b);

	}
	

	static void addToList(List<Integer> myList) {
		Random rand = new Random();
		for (int i = 0; i < 1000000; i++) {
			myList.add(rand.nextInt(10));
		}
	}
	static void choseElement(List<Integer> myList) {
		Random rand = new Random();
		int d = 0;
		for (int i = 0; i < 100000; i++) {
			d=myList.get(rand.nextInt(1000000));
		}
	}
}
