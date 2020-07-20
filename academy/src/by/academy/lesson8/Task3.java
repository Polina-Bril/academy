package by.academy.lesson8;

public class Task3 {
	
//	3. С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит.
//	Вывести строку в следующем формате:
//	День: <Day>
//	Месяц: <Month>
//	Year: <Year>

	public static void main(String[] args) {
		

		String tests[] = { "50/50/9999", "00/00/0000", "43/12/2020", "49-9-2020" };
		String tests2[] = { "10/50/1999", "00/00/0000", "43/12/2020", "49-9-2020" };
		
		for (String t:tests1) {
			t
		}

	}
public static boolean isValidDateString(String stringDate) {
	Matcher m1=p1.matcher(stringDate);
	if(m1.find()) {
		return true;
	}
	Matcher m2=p1.matcher(stringDate);
	if(m1.find()) {
		return true;
	}
}
}
