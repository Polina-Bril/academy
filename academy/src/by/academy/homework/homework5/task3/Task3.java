package by.academy.homework.homework5.task3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). 
//В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. Создайте каталог
//(папку) users и для каждого пользователя создайте файл в этом каталоге. Назовите файл
//Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя. 
//Не забываем закрывать потоки. В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

public class Task3 {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>(10);
		users.add(new User("Vasya", "Vaskin", 20));
		users.add(new User("Olga", "Olkina", 18));
		users.add(new User("Kolya", "Kolkin", 15));
		users.add(new User("Irina", "Irkina", 25));
		users.add(new User("Natasha", "Natkina", 17));
		users.add(new User("Boris", "Borkin", 28));
		users.add(new User("Sveta", "Svetkina", 19));
		users.add(new User("Sasha", "Sashkin", 17));
		users.add(new User("Dima", "Dimkin", 20));
		users.add(new User("Kolya", "Pupkin", 22));
		new File("academy\\src\\by\\academy\\homework\\homework5\\task3\\users").mkdir();
		for (User u : users) {
			try (ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("academy\\src\\by\\academy\\homework\\homework5\\task3\\users\\" + u.getName()
							+ "_" + u.getSurname() + ".txt"))) {
				out.writeObject(u);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
