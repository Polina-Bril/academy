package by.academy.homework.homework3.task1;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDate {

	private String date;
	private Year year;
	private Month month;
	private Day day;
	public static Pattern p = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");

	public MyDate() {
		super();
	}

	public MyDate(Day day, Month month, Year year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.date = "" + day.getDay() + "-" + month.getMonth() + "-" + year.getYear();

	}

	public MyDate(String date) {
		Matcher m = p.matcher(date);
		if (m.find()) {
			System.out.println("Date is valid");
			this.date = date;
			this.year = new Year(Integer.parseInt(date.replaceAll("^\\D*?(\\d+)-(\\d+)-(\\d+)$", "$3")));
			this.month = new Month(Integer.parseInt(date.replaceAll("^\\D*?(\\d+)-(\\d+)-(\\d+)$", "$2")));
			this.day = new Day(Integer.parseInt(date.replaceAll("^\\D*?(\\d+)-(\\d+)-(\\d+)$", "$1")));

		} else {
			System.out.println("Date is not valid. Check it and try again!");
		}

	}

	public WeekDay getWeekDay(String date) {
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
		case "вторник":
			weekDay = WeekDay.TUESDAY;
		case "среда":
			weekDay = WeekDay.WEDNESDAY;
		case "четверг":
			weekDay = WeekDay.THURSDAY;
		case "пятница":
			weekDay = WeekDay.FRIDAY;
		case "суббота":
			weekDay = WeekDay.SATURDAY;
		case "воскресенье":
			weekDay = WeekDay.SUNDAY;
		}

		return weekDay;
	}

	public long numberOfDays(String date1, String date2) {
		SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
		java.util.Date day1 = null;
		java.util.Date day2 = null;
		try {
			day1 = format.parse(date1);
			day2 = format.parse(date2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ((Math.max(day1.getTime(), day2.getTime()) - Math.min(day1.getTime(), day2.getTime())) / 1000 / 60 / 60
				/ 24);
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public String getDate() {
		return date;
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

		public boolean isLeapYear(int year) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				return true;
			} else {
				return false;
			}
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
}
