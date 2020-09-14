package by.academy.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task2 {

	static boolean isAnagram(String a, String b) {
		Map<Character, Integer> forA = new TreeMap<>();
		for (char ch : a.toUpperCase().toCharArray()) {
			if (forA.containsKey(ch)) {
				forA.put(ch, forA.get(ch) + 1);
			} else {
				forA.put(ch, 1);
			}
		}
		Map<Character, Integer> forB = new TreeMap<>();
		for (char ch : b.toUpperCase().toCharArray()) {
			if (forB.containsKey(ch)) {
				forB.put(ch, forB.get(ch) + 1);
			} else {
				forB.put(ch, 1);
			}
		}
			System.out.println(forA);
			System.out.println(forB);

			int n = 0;
			if (forA.size() == forB.size()) {
				for (char c : forA.keySet()) {
					if (forB.containsKey(c) && forA.get(c) == forB.get(c)) {
						n++;
					}else return false;
				}
				if (n == forA.size())
					return true;
			}
		return false;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
