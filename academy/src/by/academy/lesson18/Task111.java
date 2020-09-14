package by.academy.lesson18;

import java.util.ArrayList;
import java.util.Scanner;

public class Task111 {
	public static void main(String... sav) {
		 
		StringBuilder sb = new StringBuilder("");
		Scanner scan = new Scanner(System.in);
		while (true) {
			String current = scan.nextLine();
			sb.append(current + " ");
			if (current.equals(""))
				break;

		}
		String s = sb.toString();
		String strArr[] = s.split(" ");
		ArrayList<Integer> inty = new ArrayList<>();

		for (int i = 0; i < strArr.length; i++) {
			inty.add(Integer.parseInt(strArr[i]));
		}
		System.out.println(inty);
		int nLines = inty.get(0);
		int nNumbersInLine = inty.get(1);
		int index = 1;
		for (int j = 1; j <= nLines; j++) {
			ArrayList<Integer> values = new ArrayList<>();
			for (int a = 0; a < nNumbersInLine; a++) {
				values.add(inty.get(++index));
			}
			nNumbersInLine = inty.get(++index);
		}
		int q = nNumbersInLine;
		for (int b = 1; b <= q; b++) {
			int x = inty.get(++index);
			int y = inty.get(++index);
			getIntInTheLine(x, y, inty);
		}

		scan.close();
	}

	public static void getIntInTheLine(int x, int y, ArrayList<Integer> inty) {
		int nLines = inty.get(0);
		int nNumbersInLine = inty.get(1);
		int index = 1;
		boolean flag = false;
		for (int j = 1; j <= nLines; j++) {
			ArrayList<Integer> values = new ArrayList<>();
			for (int i = 0; i < nNumbersInLine; i++) {
				values.add(inty.get(++index));
				if (j == x && i == y - 1) {
					System.out.println(values.get(i));
					flag = true;
				}
			}
			nNumbersInLine = inty.get(++index);
		}
		if (!flag) {
			System.out.println("ERROR!");
		}
	}
}
