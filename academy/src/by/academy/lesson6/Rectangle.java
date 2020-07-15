package by.academy.lesson6;

public class Rectangle extends Shape{
	
	private int x;
	private int y;

	public Rectangle() {
		super();
	}
	public Rectangle (String color, int x, int y){
		this.color= color;
		this.x=x;
		this.y=y;
	}
	public void draw() {
		System.out.println("Я рисую треугольник");
	};
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
	@Override
	public boolean equals(Object object) {
		if (this ==object ) {
			System.out.println("Объекты идентичны");
			return true;
		} else {
			System.out.println("Объекты не идентичны");
				return false;}
	}
		
		
	}

