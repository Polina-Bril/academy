package by.academy.lesson5.newTasks.Task2;

public class Person {
	int age;
	String fullName;

	public Person() {
		
	}
	public Person(String fullName, int age) {
		this.fullName=fullName;
		this.age=age;
		}
	public void move() {
		System.out.println(fullName+" двигается");
	}
	public void talk() {
		System.out.println(fullName+" говорит");
	}
}
