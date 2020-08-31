package by.academy.lesson17;

public class Cat {

	public String name;
	private int age;
	protected boolean isHvostExist;

	public Cat() {
		super();
	}

	public Cat(String name, int age, boolean isHvostExist) {
		super();
		this.name = name;
		this.age = age;
		this.isHvostExist = isHvostExist;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@AnnotForCatOrTiger(version2 = 2, verstion1 = "Two")
	private void setAge(int age) {
		this.age = age;
	}

	public boolean isHvostExist() {
		return isHvostExist;
	}

	public void setHvostExist(boolean isHvostExist) {
		this.isHvostExist = isHvostExist;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", isHvostExist=" + isHvostExist + "]";
	}

}
