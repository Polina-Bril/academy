package by.academy.lesson19.task4;

public class Fruit {
	
	private int name;
	private String color;
	private boolean isSochny;
	private boolean isSweet;
	

	public Fruit(int name) {
		super();
		this.name=name;
	}

	public Fruit(int name, String color, boolean isSochny, boolean isSweet) {
		super();
		this.color = color;
		this.isSochny = isSochny;
		this.isSweet = isSweet;
		this.name=name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isSochny() {
		return isSochny;
	}

	public void setSochny(boolean isSochny) {
		this.isSochny = isSochny;
	}

	public boolean isSweet() {
		return isSweet;
	}

	public void setSweet(boolean isSweet) {
		this.isSweet = isSweet;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

}
