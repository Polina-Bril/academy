package by.academy.lesson5.newTasks.Task7.professions;

public class Driver extends Person{
	
	public int stazh;

	public Driver() {
	}
	public Driver(String fio, int age, int stazh) {
		super(fio, age);
		this.stazh=stazh;
	}
}
