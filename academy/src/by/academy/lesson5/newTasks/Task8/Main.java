package by.academy.lesson5.newTasks.Task8;

public class Main {

	public static void main(String[] args) {
		int kolichestvoTipov=3;
		Animal animal[]=new Animal[kolichestvoTipov];
		Dog dog = new Dog("�����", "������", "�������", "������ �����");
		animal[0]=dog;
		Cat cat = new Cat("������", "���", true, "��� �����");
		animal[1]=cat;
		Horse horse = new Horse("����", "������", "�������", "���� �����");
		animal[2]=horse;
		for (int i=0; i<animal.length;i++) {
			animal[i].treatAnimal(animal[i]);
			animal[i].eat();
			animal[i].makeNoise();
			animal[i].sleep();
		}
	}

}
