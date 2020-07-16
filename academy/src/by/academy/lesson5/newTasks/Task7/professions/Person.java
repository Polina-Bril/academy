package by.academy.lesson5.newTasks.Task7.professions;

public class Person {
	
	private int age;
	private String fio;

	public Person() {
		super();
		}
	public Person(String fio, int age) {
		super();
		this.fio=fio;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	
}
