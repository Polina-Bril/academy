package by.academy.homework.homework4;

import java.util.Map;
import java.util.TreeMap;

public class Task3 {

//	Можно писать все в main. Не нужно создавать новых классов. 	Имеется текст. Следует
//	составить для него частотный словарь: Создать Map<Character, Integer> для символов, 
//	в который мы заносим символ и его количество.

	public static void main(String[] args) {
		String s = "Можно писать все в main. Не нужно создавать новых классов. Имеется текст. Следует составить для него частотный словарь: Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.";
		char[] sToChar = s.toCharArray();
		Map<Character, Integer> dictionary = new TreeMap<>();

		for (char ch : sToChar) {
			addToMap(dictionary, ch);
		}
		for (char ch : dictionary.keySet()) {
			System.out.println(ch + " " + dictionary.get(ch));
		}
	}

	public static void addToMap(Map<Character, Integer> map, char ch) {
		if (map == null) {
			return;
		}

		if (map.containsKey(ch)) {
			map.put(ch, map.get(ch) + 1);
		} else {
			map.put(ch, 1);
		}
	}
}
