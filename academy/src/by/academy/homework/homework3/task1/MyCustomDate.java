package by.academy.homework.homework3.task1;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCustomDate {

	private Year year;
	private Month month;
	private Day day;
	public static Pattern p = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");

	public MyCustomDate() {
		super();
		setDate("1-1-1900");
	}

	public MyCustomDate(String date) {
		super();
		setDate(date);
	}

	public MyCustomDate(int day, int month, int year) {
		super();
		this.year = new Year(year);
		this.month = new Month(month);
		this.day = new Day(day);
	}

	public void setDate(String date) {
		Matcher m = p.matcher(date);
		if (m.find()) {
			System.out.println("Date is valid");
			this.year = new Year(Integer.parseInt(date.replaceAll("^\\D*?(\\d+)-(\\d+)-(\\d+)$", "$3")));
			this.month = new Month(Integer.parseInt(date.replaceAll("^\\D*?(\\d+)-(\\d+)-(\\d+)$", "$2")));
			this.day = new Day(Integer.parseInt(date.replaceAll("^\\D*?(\\d+)-(\\d+)-(\\d+)$", "$1")));

		} else {
			System.out.println("Date is not valid. Check it and try again!");
		}
	}

	public WeekDay getWeekDay() {
		StringBuilder sb = new StringBuilder();
		sb.append(getDay()).append("-").append(getMonth()).append("-").append(getYear());
		String date = sb.toString();
		SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
		java.util.Date dayWeek = null;
		try {
			dayWeek = format.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String s = new SimpleDateFormat("EEEE").format(dayWeek);
		WeekDay weekDay = null;
		switch (s) {
		case "понедельник":
			weekDay = WeekDay.MONDAY;
			break;
		case "вторник":
			weekDay = WeekDay.TUESDAY;
			break;
		case "среда":
			weekDay = WeekDay.WEDNESDAY;
			break;
		case "четверг":
			weekDay = WeekDay.THURSDAY;
			break;
		case "пятница":
			weekDay = WeekDay.FRIDAY;
			break;
		case "суббота":
			weekDay = WeekDay.SATURDAY;
			break;
		case "воскресенье":
			weekDay = WeekDay.SUNDAY;
			break;
		}

		return weekDay;
	}

	public static long daysBetween(MyCustomDate date1, MyCustomDate date2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		sb1.append(date1.getDay()).append("-").append(date1.getMonth()).append("-").append(date1.getYear());
		String dateStr1 = sb1.toString();
		sb2.append(date2.getDay()).append("-").append(date2.getMonth()).append("-").append(date2.getYear());
		String dateStr2 = sb2.toString();
		SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
		java.util.Date day1 = null;
		java.util.Date day2 = null;
		try {
			day1 = format.parse(dateStr1);
			day2 = format.parse(dateStr2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ((Math.max(day1.getTime(), day2.getTime()) - Math.min(day1.getTime(), day2.getTime())) / 1000 / 60 / 60
				/ 24);
	}

	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}

	public int getYear() {
		return year.getYear();
	}

	public void setYear(int year) {
		this.year.setYear(year);
	}

	public int getMonth() {
		return month.getMonth();
	}

	public void setMonth(int month) {
		this.month.setMonth(month);
	}

	public int getDay() {
		return day.getDay();
	}

	public void setDay(int day) {
		this.day.setDay(day);
	}

	class Year {
		private int year;

		public Year() {
			super();
		}

		public Year(int year) {
			super();
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
	}

	class Month {
		private int month;

		public Month() {
			super();
		}

		public Month(int month) {
			super();
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}
	}

	class Day {
		private int day;

		public Day() {
			super();
		}

		public Day(int day) {
			super();
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getDay()).append("-").append(getMonth()).append("-").append(getYear());
		return sb.toString();
	}

}
