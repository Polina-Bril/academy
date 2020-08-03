package homework.homework3.task1;

public enum WeekDay {
	
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private int value;

	private WeekDay(int number) {
		this.value = number;
	}

	public void printCurrentDay() {
		System.out.println(this);
	}

	public int getValue() {
		return value;
	}
}