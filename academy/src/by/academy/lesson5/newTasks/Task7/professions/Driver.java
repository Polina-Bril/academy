package by.academy.lesson5.newTasks.Task7.professions;

public class Driver extends Person{
	
	private int stazh;

	public Driver() {
		super();
	}
	public Driver(String fio, int age, int stazh) {
		super(fio, age);
		this.stazh=stazh;
	}
	public int getStazh() {
		return stazh;
	}
	public void setStazh(int stazh) {
		this.stazh = stazh;
	}
	
}
