package by.academy.lesson7.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

//	3. ������� ������ � �������. ������� �����, ������������ �� ��������� ����	���� ����

	public static void main(String[] args) {

		String s = "������� ������ � �������. ������� �����, ������������ �� ��������� ����	���� ����.";
		Pattern p = Pattern.compile("[a-zA-Z�-��-�]+");
		Matcher m = p.matcher(s);

		while (m.find()) {
			System.out.print(s.substring(m.end() - 1, m.end()));
		}
	}
}
