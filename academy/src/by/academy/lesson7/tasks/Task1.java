package by.academy.lesson7.tasks;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

//	1. ����� � ������ �� ������ �������, �� � ������ ����� ����������. ���������� ����� �� ����������

	public static void main(String[] args) {

		String s = "����� � ������ �� ������ �������, �� � ������ ����� ����������." + "����� �� ����������!";

		Pattern p = Pattern.compile("[,.!?]");
		Matcher m = p.matcher(s);

		int counter = 0;
		while (m.find()) {
			counter++;
		}
		System.out.println("Counter: " + counter);

	}

}
