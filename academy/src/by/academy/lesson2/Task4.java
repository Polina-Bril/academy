package by.academy.lesson2;

public class Task4 {

	public static void main(String[] args) {
		int s = 3700000;
		int sec;
		int m, h, d;
		int min, hour;
		int day, week;
		sec = s%60;
		m = (s-sec)/60;
		min = m%60;
		h = (m-min)/60;
		hour = h%24;
		d = (h-hour)/24;
		day = d%7;
		week = (d-day)/7;
		System.out.println(week+" ������ "+day+" ���� "+hour+" ����� "+min+" ����� "+sec+" ������ ");
			
	}
}
