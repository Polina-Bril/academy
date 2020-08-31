package by.academy.lesson17;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TaskV16Reflection {

	public static void main(String[] args) {
		
		Cat meow = new Cat ();
		Tiger rrr= new Tiger();

		Class<Cat> catClass = Cat.class;
		Class<Tiger> tigerClass = Tiger.class;
		
		Method [] catDeclaredMethods= catClass.getDeclaredMethods();
		Method [] catMethods= catClass.getMethods();
		System.out.println(Arrays.toString(catDeclaredMethods));
		System.out.println(Arrays.toString(catMethods));
		
		Method [] tigerDeclaredMethods= tigerClass.getDeclaredMethods();
		Method [] tigerMethods= tigerClass.getMethods();
		System.out.println(Arrays.toString(tigerDeclaredMethods));
		System.out.println(Arrays.toString(tigerMethods));
		System.out.println();
		Field [] catFields = catClass.getFields();
		for (Field f:catFields) {
			System.out.println(f.getName());
		}
		Field [] catDeclaredFields = catClass.getDeclaredFields();
		System.out.println();
		for (Field f:catDeclaredFields) {
			System.out.println(f.getName());
		}
		System.out.println(Arrays.toString(catFields));
		System.out.println(Arrays.toString(catDeclaredFields));
		
		Field [] tigerFields = tigerClass.getFields();
		System.out.println();
		for (Field f:tigerFields) {
			System.out.println(f.getName());
		}
		Field [] tigerDeclaredFields = tigerClass.getDeclaredFields();
		System.out.println();
		for (Field f:tigerDeclaredFields) {
			System.out.println(f.getName());
		}
		System.out.println(Arrays.toString(tigerFields));
		System.out.println(Arrays.toString(tigerDeclaredFields));
		
		Field ageCat ;
		
		try {
			ageCat= catClass.getDeclaredField("age");
			ageCat.setAccessible(true);
			ageCat.set(meow, 10);
			System.out.println(meow);
		
			Field foodTiger = tigerClass.getField("food");
			foodTiger.set(rrr, "Bird");
			
				} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		Method runTiger;
		try {
			runTiger= tigerClass.getDeclaredMethod("run");
			runTiger.setAccessible(true);
			runTiger.invoke(rrr);
			
				} catch (InvocationTargetException| SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException e) {
			e.printStackTrace();
				}
		
		}

}
