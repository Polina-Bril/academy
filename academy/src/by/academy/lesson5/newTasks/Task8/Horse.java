package by.academy.lesson5.newTasks.Task8;

public class Horse extends Animal{
	
	String mast;
		
	public Horse() {
	}
	public Horse (String food, String location, String mast, String name) {
		this.food=food;
		this.location=location;
		this.mast=mast;
		this.name=name;
	}
	public void makeNoise() {
		System.out.println(name+" ржет");
	}
	public void eat() {
		System.out.println(name+" чавкает");
	}
}
