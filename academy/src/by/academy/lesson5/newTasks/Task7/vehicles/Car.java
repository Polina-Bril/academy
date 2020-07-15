package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;
import by.academy.lesson5.newTasks.Task7.professions.Person;

public class Car {
	
	String markaAvto;
	String klassAvto;
	double ves;
	Driver driver;
	Engine engine;

	public Car() {
	}
	public Car(String markaAvto, String klassAvto, double ves, Driver driver, Engine engine) {
	this.markaAvto=markaAvto;
	this.klassAvto=klassAvto;
	this.ves=ves;
	this.driver=driver;
	this.engine=engine;
	}
	public void start() {
		System.out.println("Поехали!");
	}
	public void stop() {
		System.out.println("Останавливаемся");
	}
	public void turnRight() {
		System.out.println("Поворот направо");
	}
	public void turnLeft() {
		System.out.println("Поворот налево");
	}
	public void printInfo() {
		System.out.println("Информация об автомобиле: марка - "+markaAvto+", класс - "+klassAvto+", вес - "+ves+" т, водитель - "+driver.fio+", мотор - "+engine.mosch+" лошадей, мотор произведен фирмой "+engine.proizvoditel);
	}
}
