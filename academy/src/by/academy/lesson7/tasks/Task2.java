package by.academy.lesson7.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	// 2. ������� ������ � �������. ���������� ���������� ���� � ������. ����������
	// ������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����
	// ������ ����� ����� ���� �������, �� ����� � �������������.

	public static void main(String[] args) {
		String s = " ��� ������ ������ �   �������. � ��� ���� ���������� ���������� ����.   ";

		// Pattern p = Pattern.compile(" +");
		// Matcher m = p.matcher(s);
		int n = 0;
		String[] arr = s.split(" +");
		for (String a : arr) {
			System.out.println(a + " ");
			n++;
		}
		System.out.println(n-1);
	}

}
