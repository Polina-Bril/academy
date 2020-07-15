package by.academy.lesson5.newTasks.Task8;

public class Animal implements Veterinar {

	String food;
	String location;
	String name;
	
	public Animal() {	}
	public Animal(String food, String location) {
		this.food=food;
		this.location=location;
	}
	public void makeNoise() {
		System.out.println(name+" шумит");
	}
	public void sleep() {
		System.out.println(name+" спит");
	}
	public void eat() {
		System.out.println(name+" ест");
	}
	public void treatAnimal(Animal animal) {
		System.out.println(animal.food+" "+animal.location);
	}
}
