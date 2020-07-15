package by.academy.lesson5.newTasks.Task8;

public class Dog extends Animal {
	
	String poroda;
	
	public Dog() {
	}
	public Dog (String food, String location, String poroda, String name) {
		this.food=food;
		this.location=location;
		this.poroda=poroda;
		this.name=name;
	}
	public void makeNoise() {
		System.out.println(name+" гавкает");
	}
	public void eat() {
		System.out.println(name+" кушает");
	}
}
