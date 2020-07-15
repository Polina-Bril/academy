package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;

public class Car {

	String markaAvto;
	String klassAvto;
	double ves;
	Driver driver;
	Engine engine;

	public Car() {
	}

	public Car(String markaAvto, String klassAvto, double ves, Driver driver, Engine engine) {
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
				+ ves + " �, �������� - " + driver.fio + ", ����� - " + engine.getMosch()
				+ " �������, ����� ���������� ������ " + engine.getProizvoditel());
	}
}
