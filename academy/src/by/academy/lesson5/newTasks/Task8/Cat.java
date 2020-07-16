package by.academy.lesson5.newTasks.Task8;

public class Cat extends Animal {

	private boolean sherst;
		
	public Cat() {
		super();
	}
	public Cat (String food, String location, boolean sherst, String name) {
		super(food, location, name);
		this.sherst=sherst;
	}
	public void makeNoise() {
		System.out.println(name+" м€укает");
	}
	public void eat() {
		System.out.println(name+" лакает");
	}
	public boolean isSherst() {
		return sherst;
	}
	public void setSherst(boolean sherst) {
		this.sherst = sherst;
	}
	
}
