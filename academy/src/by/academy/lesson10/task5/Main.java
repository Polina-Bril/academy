package by.academy.lesson10.task5;

public class Main {

	public static void main(String[] args) {
		
		Food steak = new Food();
		String str = "на сковороде";
		steak.prepare(str, new Cookable() {
			@Override
			public void cook(String str) {
				System.out.println("Я жарюсь "+str);
				
			}
		});

	}

}
