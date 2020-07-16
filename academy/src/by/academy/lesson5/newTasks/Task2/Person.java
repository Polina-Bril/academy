package by.academy.lesson5.newTasks.Task2;

public class Person {
	private int age;
	private String fullName;

	public Person() {
		super();
	}
	public Person(String fullName, int age) {
		super();
		this.fullName=fullName;
		this.age=age;
		}
	public void move() {
		System.out.println(fullName+" двигается");
	}
	public void talk() {
		System.out.println(fullName+" говорит");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
