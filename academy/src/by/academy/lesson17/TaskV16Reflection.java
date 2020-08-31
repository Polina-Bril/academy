package by.academy.lesson17;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import jdk.jfr.Description;

public class TaskV16Reflection {

	public static void main(String[] args) {

		Cat meow = new Cat();
		Tiger rrr = new Tiger();

		Class<Cat> catClass = Cat.class;
		Class<Tiger> tigerClass = Tiger.class;

		Method[] catDeclaredMethods = catClass.getDeclaredMethods();
		Method[] catMethods = catClass.getMethods();
		Set<Method> catAllMethods = new HashSet<>();
		catAllMethods.addAll(Arrays.asList(catDeclaredMethods));
		catAllMethods.addAll(Arrays.asList(catMethods));
		System.out.println("Все методы Cat: " + catAllMethods);

		Method[] tigerDeclaredMethods = tigerClass.getDeclaredMethods();
		Method[] tigerMethods = tigerClass.getMethods();
		Set<Method> tigerAllMethods = new HashSet<>();
		tigerAllMethods.addAll(Arrays.asList(tigerDeclaredMethods));
		tigerAllMethods.addAll(Arrays.asList(tigerMethods));
		System.out.println("Все методы Tiger: " + tigerAllMethods);

		Field[] catFields = catClass.getFields();
		Field[] catDeclaredFields = catClass.getDeclaredFields();
		Set<Field> catAllFields = new HashSet<>();
		catAllFields.addAll(Arrays.asList(catFields));
		catAllFields.addAll(Arrays.asList(catDeclaredFields));
		System.out.print("Название переменных Саt: ");
		for (Field f : catAllFields) {
			System.out.print(f.getName() + ", ");
		}

		Field[] tigerFields = tigerClass.getFields();
		Field[] tigerDeclaredFields = tigerClass.getDeclaredFields();
		Set<Field> tigerAllFields = new HashSet<>();
		tigerAllFields.addAll(Arrays.asList(tigerFields));
		tigerAllFields.addAll(Arrays.asList(tigerDeclaredFields));
		System.out.print("\nНазвание переменных Tiger: ");
		for (Field f : tigerAllFields) {
			System.out.print(f.getName() + ", ");
		}

		Field ageCat;
		Field foodTiger;

		try {
			ageCat = catClass.getDeclaredField("age");
			ageCat.setAccessible(true);
			ageCat.set(meow, 10);
			System.out.println("\nИзмененное поле для Cat: " + meow);

			foodTiger = tigerClass.getField("food");
			foodTiger.set(rrr, "Bird");
			System.out.println("Измененное поле для Tiger: " + rrr);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("Все переменные Cat: " + catAllFields);
		System.out.println("Все переменные Tiger: " + tigerAllFields);

		Method runTiger;
		try {
			runTiger = tigerClass.getDeclaredMethod("run");
			runTiger.setAccessible(true);
			runTiger.invoke(rrr);

		} catch (InvocationTargetException | SecurityException | IllegalArgumentException | IllegalAccessException
				| NoSuchMethodException e) {
			e.printStackTrace();
		}
		Method catSetAge;
		Method tigerRun;
		try {
			catSetAge = catClass.getDeclaredMethod("setAge", int.class);
			AnnotForCatOrTiger catAnnotation = catSetAge.getAnnotation(AnnotForCatOrTiger.class);
			System.out.println("Значения из аннотаци в классе Cat: " + catAnnotation.version2() + " и "
					+ catAnnotation.verstion1());
			tigerRun = tigerClass.getDeclaredMethod("run");
			AnnotForCatOrTiger tigerAnnotation = tigerRun.getAnnotation(AnnotForCatOrTiger.class);
			System.out.println("Значения из аннотаци в классе Tiger: " + tigerAnnotation.version2() + " и "
					+ tigerAnnotation.verstion1());

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

	}

}
