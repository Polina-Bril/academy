package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;

public class SportCar extends Car{
	
	int maxSpeed;

	public SportCar() {
	}
	public SportCar (String markaAvto, String klassAvto, double ves, Driver driver, Engine engine, int maxSpeed) {
		super(markaAvto, klassAvto, ves, driver, engine);
		this.maxSpeed=maxSpeed;
}
}
