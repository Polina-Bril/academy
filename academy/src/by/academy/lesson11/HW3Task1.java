package by.academy.lesson11;

public class HW3Task1 {
	
	public static void main (String [] agrs) {
	
	Date d1= new Date();
	Date.Day dd1 = new Date().new Day(6);
	Date.Month mm1 = new Date().new Month(4);
	Date.Year yy1 = new Date().new Year(1984);
	Date d3= new Date (dd1, mm1, yy1);
	
	Date d2= new Date("29-04-1984");
	System.out.println(d2.getWeekDay(d2.getDate()));
	System.out.println(d2.numberOfDays(d2.getDate(), d3.getDate()));
	
	Date.Year yy2 = new Date().new Year(2011);	
	System.out.println(yy2.isLeapYear(yy2.getYear()));
	}
	
}
