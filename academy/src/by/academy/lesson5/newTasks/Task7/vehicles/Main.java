package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;

public class Main {

	public static void main(String[] args) {

		Driver driver1 = new Driver("������ �.�.", 40, 15);
		Engine engine1 = new Engine(125, "������������");
		Driver driver2 = new Driver("������ �.�,", 43, 25);
		Engine engine2 = new Engine(182, "������������");
		Driver driver3 = new Driver("������� �.�.", 33, 14);
		Engine engine3 = new Engine(118, "�����������");
		Lorry car1 = new Lorry("Scania", "��������", 17.5, driver1, engine1, 22);
		SportCar car2 = new SportCar("�������", "����������", 0.754, driver2, engine2, 350);
		Car car3 = new Car("����", "�����������������", 0.555, driver3, engine3);

		car1.start();
		car2.stop();
		car3.turnLeft();
		car1.turnRight();
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();

	}

}
