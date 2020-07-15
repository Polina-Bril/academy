package by.academy.lesson6.newTasks.Task11;

public abstract class Shape {
	
	protected String color;

	public Shape() {
		super();
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public abstract void draw();
	public abstract boolean equals(Object object);
}
