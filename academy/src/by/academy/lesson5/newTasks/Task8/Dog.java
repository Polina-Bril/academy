package by.academy.lesson5.newTasks.Task8;

public class Dog extends Animal {
	
	private String poroda;
	
	public Dog() {
		super();
	}
	public Dog (String food, String location, String poroda, String name) {
		super(food, location, name);
		this.poroda=poroda;
		}
	public void makeNoise() {
		System.out.println(name+" гавкает");
	}
	public void eat() {
		System.out.println(name+" кушает");
	}
	public String getPoroda() {
		return poroda;
	}
	public void setPoroda(String poroda) {
		this.poroda = poroda;
	}
	
}
