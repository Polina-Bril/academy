package by.academy.lesson5.newTasks.Task2;

public class Main {

	public static void main(String[] args) {
		Person sasha = new Person();
		sasha.fullName= "Александр Сергеевич";
		Person dasha = new Person("Дарья Сергеевна", 18);
		
		sasha.talk();
		dasha.move();

	}

}
