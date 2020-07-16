package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;

public class SportCar extends Car{
	
	private int maxSpeed;

	public SportCar() {
		super();
	}
	public SportCar (String markaAvto, String klassAvto, double ves, Driver driver, Engine engine, int maxSpeed) {
		super(markaAvto, klassAvto, ves, driver, engine);
		this.maxSpeed=maxSpeed;
}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
