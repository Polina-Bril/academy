package by.academy.lesson5.newTasks.Task2;

public class Main {

	public static void main(String[] args) {
		Person sasha = new Person();
		sasha.setFullName("��������� ���������");
		Person dasha = new Person("����� ���������", 18);
		
		sasha.talk();
		dasha.move();

	}

}
