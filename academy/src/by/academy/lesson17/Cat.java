package by.academy.lesson17;

public class Cat {

	public String name;
	private int age;
	protected boolean isHvostExist;
	
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
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
