package by.academy.lesson5.newTasks.Task8;

public abstract class Animal implements Veterinar {

	protected String food;
	protected String location;
	protected String name;
	
	public Animal() {	
		super();
	}
	public Animal(String food, String location, String name) {
		super();
		this.food=food;
		this.location=location;
		this.name=name;
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
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
