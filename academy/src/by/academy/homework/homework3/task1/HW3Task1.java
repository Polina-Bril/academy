package by.academy.homework.homework3.task1;

public class HW3Task1 {
	
	public static void main (String [] agrs) {
	
	MyDate d1= new MyDate();
	MyDate.Day dd1 = new MyDate().new Day(6);
	MyDate.Month mm1 = new MyDate().new Month(4);
	MyDate.Year yy1 = new MyDate().new Year(1984);
	MyDate d3= new MyDate (dd1, mm1, yy1);
	
	MyDate d2= new MyDate("29-04-1984");
	System.out.println(d2.getWeekDay(d2.getDate()));
	System.out.println(d2.numberOfDays(d2.getDate(), d3.getDate()));
	
	MyDate.Year yy2 = new MyDate().new Year(2011);	
	System.out.println(yy2.isLeapYear(yy2.getYear()));
	}
	
}
