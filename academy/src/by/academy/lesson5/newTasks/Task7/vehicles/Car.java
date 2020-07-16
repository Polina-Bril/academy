package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;

public class Car {

	private String markaAvto;
	private String klassAvto;
	private double ves;
	private Driver driver;
	private Engine engine;

	public Car() {
		super();
	}

	public Car(String markaAvto, String klassAvto, double ves, Driver driver, Engine engine) {
		super();
		this.markaAvto = markaAvto;
		this.klassAvto = klassAvto;
		this.ves = ves;
		this.driver = driver;
		this.engine = engine;
	}

	public void start() {
		System.out.println("�������!");
	}

	public void stop() {
		System.out.println("���������������");
	}

	public void turnRight() {
		System.out.println("������� �������");
	}

	public void turnLeft() {
		System.out.println("������� ������");
	}

	public void printInfo() {
		System.out.println("���������� �� ����������: ����� - " + markaAvto + ", ����� - " + klassAvto + ", ��� - "
				+ ves + " �, �������� - " + driver.getFio() + ", ����� - " + engine.getMosch()
				+ " �������, ����� ���������� ������ " + engine.getProizvoditel());
	}

	public String getMarkaAvto() {
		return markaAvto;
	}

	public void setMarkaAvto(String markaAvto) {
		this.markaAvto = markaAvto;
	}

	public String getKlassAvto() {
		return klassAvto;
	}

	public void setKlassAvto(String klassAvto) {
		this.klassAvto = klassAvto;
	}

	public double getVes() {
		return ves;
	}

	public void setVes(double ves) {
		this.ves = ves;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
