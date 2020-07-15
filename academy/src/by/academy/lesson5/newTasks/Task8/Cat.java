package by.academy.lesson5.newTasks.Task8;

public class Cat extends Animal {

	boolean sherst;
		
	public Cat() {
	}
	public Cat (String food, String location, boolean sherst, String name) {
		this.food=food;
		this.location=location;
		this.sherst=sherst;
		this.name=name;
	}
	public void makeNoise() {
		System.out.println(name+" м€укает");
	}
	public void eat() {
		System.out.println(name+" лакает");
	}
}
