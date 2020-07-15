package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;

public class Lorry extends Car {

	int gruzopodem;

	public Lorry() {

	}

	public Lorry(String markaAvto, String klassAvto, double ves, Driver driver, Engine engine, int gruzopodem) {
		super(markaAvto, klassAvto, ves, driver, engine);
		this.gruzopodem = gruzopodem;
	}

}
