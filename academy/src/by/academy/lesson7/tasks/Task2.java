package by.academy.lesson7.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

// 2. ������� ������ � �������. ���������� ���������� ���� � ������. ���������� ������, ��� ����� �����
//	����������� ����������� ���������, � ������ � ����� ������ ����� ����� ���� �������, �� ����� � �������������.

	public static void main(String[] args) {
		String s = " ��� ������ ������ �   �������. � ��� ���� ���������� ���������� ����.   ";
		Pattern p = Pattern.compile("[�-��-�A-Za-z]+");
		Matcher m = p.matcher(s);
		int count = 0;

		while (m.find()) {
			count++;
		}
		System.out.println(count);
	}
}
