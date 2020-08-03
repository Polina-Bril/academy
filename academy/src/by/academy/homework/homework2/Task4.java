package by.academy.homework.homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task4 {

//	4. С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, 
//	к которому дата подходит. Вывести строку в следующем формате:
//		День: <Day>
//		Месяц: <Month>
//		Year: <Year>

	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");

	public static void main(String... args) throws ParseException {

		String[] tests1 = { "50/50/9999", "00/00/0000", "13/12/2020", "9/9/2020", "11" };
		String[] tests2 = { "50-50-9999", "00-00-0000", "13-12-2020", "12-12-2020", "11" };

		for (String t : tests1) {
			boolean isValid = Task3.isValidDateString(t);
			if (isValid) {
				Date date = format1.parse(t);
				System.out.println(date);
			}
		}
		for (String t : tests2) {
			boolean isValid = Task3.isValidDateString(t);
			if (isValid) {
				Date date = format2.parse(t);
				System.out.println(date);
			}
		}
	}
}
