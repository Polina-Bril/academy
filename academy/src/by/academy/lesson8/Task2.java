package by.academy.lesson8;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task2 {

	// 2. Ќаписать RegExp который провер€л бы введенную дату на соответствие
	// патерна:
	// a) dd/MM/yyyy
	// b) dd-MM-yyyy

	public static void main(String[] args) {

		String tests[] = { "50/50/9999", "00/00/0000", "43/12/2020", "49-9-2020" };

		Pattern p1 = Pattern.compile("(^([0]?)[0-9]|[3][01]|[12][0-9]){1,2}/([0]?[1-9]|[1][012]){1,2}/\\d{4}");
		Pattern p2 = Pattern.compile("(^([0]?)[0-9]|[3][01]|[12][0-9]){1,2}-([0]?[1-9]|[1][012]){1,2}-\\d{4}");

		for (String t : tests) {
			Matcher m1 = p1.matcher(t);
			Matcher m2 = p2.matcher(t);

			if (m1.find()) {
				System.out.println(m1.group(0));
			} else if (m2.find()) {
				System.out.println(m2.group(0));
			} else 
				System.out.println("failed");
		}
	}
}
