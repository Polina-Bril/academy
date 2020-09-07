package by.academy.homework.homework6.task2;
/*
Задача 2. Reflection API.
Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
Добавить класс User, который наследуется от Person, с полями: login, password, email
Добавить гетеры, сетеры. Добавить метод printUserInfo в User. 
Вывести с помощью рефлексии все поля и методы, сначала через 
     getMethod("name"); getMethods(); getField("name"); getFields()
а затем через 
	 getDeclaredMethod("name"); getDeclaredMethods(); getDeclaredField("name"); getDeclaredFields()
Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field).
Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.
**/

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2Runner {

	public static void main(String[] args) {

		Person pers = new Person();
		User user = new User();

		Class<Person> personCls = Person.class;
		Class<User> userCls = User.class;

		printFields(false, personCls);
		printFields(false, userCls);
		printMethods(false, personCls);
		printMethods(false, userCls);

		printFields(true, personCls);
		printFields(true, userCls);
		printMethods(true, personCls);
		printMethods(true, userCls);

		System.out.println();
		setField(userCls, "login", user, "venera_48");
		setField(userCls, "password", user, "venera.ru");
		setField(userCls, "email", user, "venera_48@mail.ru");
		setField(personCls, "firstName", pers, "Nikolas");
		setField(personCls, "lastName", pers, "Nikolaev");
		setField(personCls, "age", pers, 25);
		setField(personCls, "dateOfBirth", pers, "25.12.2014");

		printFieldValue(userCls, "login", user);
		printFieldValue(userCls, "password", user);
		printFieldValue(userCls, "email", user);
		printFieldValue(personCls, "firstName", pers);
		printFieldValue(personCls, "lastName", pers);
		printFieldValue(personCls, "age", pers);
		printFieldValue(personCls, "dateOfBirth", pers);

		runToStringByInvoke(userCls, user);
		runToStringByInvoke(personCls, pers);

	}

	public static void printMethods(boolean declared, Class<?> cls) {
		Method[] clsMethods = null;
		if (declared) {
			clsMethods = cls.getDeclaredMethods();
			System.out.println("\nAll Declared Methods of class " + cls.getCanonicalName() + ":");
		} else {
			clsMethods = cls.getMethods();
			System.out.println("\nAll Methods of class " + cls.getCanonicalName() + ":");
		}
		for (Method m : clsMethods) {
			System.out.println(m.getName());
		}
	}

	public static void printFields(boolean isDeclared, Class<? extends Person> cls) {
		Field[] clsFields = null;
		if (isDeclared) {
			clsFields = cls.getDeclaredFields();
			System.out.println("\nAll Declared Fields of class " + cls.getCanonicalName() + ":");
		} else {
			clsFields = cls.getFields();
			System.out.println("\nAll Fields of class " + cls.getCanonicalName() + ":");
		}
		for (Field f : clsFields) {
			System.out.println(f.getName());
		}
	}

	public static void setField(Class<? extends Person> cls, String fieldName, Person classObject, Object fieldValue) {
		Field clsField = null;
		try {
			clsField = cls.getDeclaredField(fieldName);
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		clsField.setAccessible(true);
		try {
			clsField.set(classObject, fieldValue);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static void printFieldValue(Class<? extends Person> cls, String fieldName, Person classObject) {
		Field clsField = null;
		try {
			clsField = cls.getDeclaredField(fieldName);
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		clsField.setAccessible(true);
		try {
			System.out.println(clsField.get(classObject));
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static void runToStringByInvoke(Class<? extends Person> cls, Person classObject) {
		Method clsMethod = null;
		try {
			clsMethod = cls.getMethod("toString");
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		String s = null;
		try {
			s = (String) clsMethod.invoke(classObject);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(s);
	}
}
