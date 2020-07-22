package by.academy.lesson9;

import by.academy.lesson5.classwork.Product;
import by.academy.lesson5.classwork.Product1;
import by.academy.lesson5.newTasks.Task7.vehicles.Car;
import by.academy.lesson5.newTasks.Task7.vehicles.Lorry;

public class Main {

	public static void main(String[] args) {
		Box<Product> box1 = new Box<>();
		box1.setItem(new Product1());

		Box<Car> box2 = new Box<>();
		box2.setItem(new Lorry());

	}

}
