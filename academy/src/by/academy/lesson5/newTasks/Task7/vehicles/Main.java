package by.academy.lesson5.newTasks.Task7.vehicles;

import by.academy.lesson5.newTasks.Task7.details.Engine;
import by.academy.lesson5.newTasks.Task7.professions.Driver;

public class Main {

	public static void main(String[] args) {

		Driver driver1 = new Driver("Иванов А.А.", 40, 15);
		Engine engine1 = new Engine(125, "Моторсмейкер");
		Driver driver2 = new Driver("Петров С.У,", 43, 25);
		Engine engine2 = new Engine(182, "Эксриммейкер");
		Driver driver3 = new Driver("Сидоров А.Ш.", 33, 14);
		Engine engine3 = new Engine(118, "Лошадмейкер");
		Lorry car1 = new Lorry("Scania", "грузовой", 17.5, driver1, engine1, 22);
		SportCar car2 = new SportCar("Феррари", "спортивный", 0.754, driver2, engine2, 350);
		Car car3 = new Car("Ауди", "представительский", 0.555, driver3, engine3);

		car1.start();
		car2.stop();
		car3.turnLeft();
		car1.turnRight();
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();

	}

}
