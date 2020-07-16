package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;

public class Lorry extends Car {

	private int gruzopodem;

	public Lorry() {
		super();
	}

	public Lorry(String markaAvto, String klassAvto, double ves, Driver driver, Engine engine, int gruzopodem) {
		super(markaAvto, klassAvto, ves, driver, engine);
		this.gruzopodem = gruzopodem;
	}

	public int getGruzopodem() {
		return gruzopodem;
	}

	public void setGruzopodem(int gruzopodem) {
		this.gruzopodem = gruzopodem;
	}
	
}
