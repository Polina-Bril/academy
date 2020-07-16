package by.academy.lesson5.newTasks.Task8;

public class Horse extends Animal{
	
	private String mast;
		
	public Horse() {
		super();
	}
	public Horse (String food, String location, String mast, String name) {
		super(food, location, name);
		this.mast=mast;
	}
	public void makeNoise() {
		System.out.println(name+" ржет");
	}
	public void eat() {
		System.out.println(name+" чавкает");
	}
	public String getMast() {
		return mast;
	}
	public void setMast(String mast) {
		this.mast = mast;
	}
	
}
