package by.academy.lesson17;

public class Tiger extends Cat{
	
	public String food;
	private int number;
	protected String favoriteFood;
	
	private void run() {
		System.out.println("Tiger running");
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	protected int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFavoriteFood() {
		return favoriteFood;
	}
	private void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	@Override
	public String toString() {
		return "Tiger [food=" + food + ", number=" + number + ", favoriteFood=" + favoriteFood + "]";
	}
	
	

}
