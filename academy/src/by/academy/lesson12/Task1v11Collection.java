package by.academy.lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Task1v11Collection {

	// 1) Напишите метод, который на вход получает коллекцию объектов, а возвращает
	// коллекцию уже без дубликатов.

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(5);
		collection.add(10);
		collection.add(15);
		collection.add(5);
		System.out.println(collection);
		Set <Integer> hashset=new HashSet<Integer>();
hashset=		NoDoubles(collection);
		System.out.println(hashset);

		// List a = new List.of(1, 3, 5, 4, 7, 5);
		// Set<Integer> hashset = new HashSet<Integer>(a);
		//
	}

	public static HashSet<Integer> NoDoubles(Collection<Integer> array) {
		return new HashSet<>(array);
	}

}
