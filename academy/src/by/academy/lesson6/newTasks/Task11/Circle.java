package by.academy.lesson6.newTasks.Task11;

public class Circle extends Shape {
	
	private int x;
	private int y;

	public Circle() {
		super();
	}
	public Circle (String color, int x, int y){
		this.color= color;
		this.x=x;
		this.y=y;
	}
	public void draw() {
		System.out.println("� ����� ����");
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean equals(Object object) {
		if (this ==object ) {
			System.out.println("������� ���������");
			return true;
		} else {
			System.out.println("������� �� ���������");
				return false;}
	}

}
