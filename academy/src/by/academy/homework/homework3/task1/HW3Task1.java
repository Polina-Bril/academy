package by.academy.homework.homework3.task1;

public class HW3Task1 {

	public static void main(String[] agrs) {

		MyCustomDate d1 = new MyCustomDate();
		d1.setDate("05-08-2020");
		MyCustomDate d2 = new MyCustomDate("29-04-1985");
		MyCustomDate d3 = new MyCustomDate(6, 4, 1984);

		System.out.println(d1.getWeekDay());
		System.out.println(d2.getWeekDay());
		System.out.println(d3.getWeekDay());
		System.out.println(MyCustomDate.daysBetween(d1, d3));
		System.out.println(MyCustomDate.daysBetween(d1, d2));
		System.out.println(MyCustomDate.daysBetween(d2, d3));
		System.out.println(MyCustomDate.isLeapYear(d1.getYear()));
		System.out.println(MyCustomDate.isLeapYear(d2.getYear()));
		System.out.println(MyCustomDate.isLeapYear(d3.getYear()));
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
