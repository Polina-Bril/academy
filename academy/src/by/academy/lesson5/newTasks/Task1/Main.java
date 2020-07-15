package by.academy.lesson5.newTasks.Task1;

public class Main {

	public static void main(String[] args) {
		Phone one = new Phone(375447755573L, "Samsung", 355);
		Phone two = new Phone (375447755574L, "iPhone", 400);
		Phone three = new Phone (375447755575L, "Vertu", 500);
		
		System.out.println("Первый телефон: "+one.getNumber()+", "+one.getModel()+", "+one.getWeight());
		System.out.println("Второй телефон: "+two.getNumber()+", "+two.getModel()+", "+two.getWeight());
		System.out.println("Третий телефон: "+three.getNumber()+", "+three.getModel()+", "+three.getWeight());
		
		one.receiveCall("Коля");
		System.out.println(one.getNumber());
		two.receiveCall("Маша");
		System.out.println(two.getNumber());
		three.receiveCall("Сергей Сергеевич");
		System.out.println(three.getNumber());
		one.receiveCall("Коля", 375297558959L);
		two.receiveCall("Маша", 375298564217L);
		three.receiveCall("Сергей Сергеевич", 375445875623L);
		
		one.sendMessage(375447755573L, 375447755572L, 375296185324L);
		System.out.println();
		two.sendMessage(375258963214L, 21541543134156L);
		System.out.println();
		three.sendMessage(375295856545L, 32541684874L, 641356716343L, 64168546413541L, 6416568453125L);
		
		
		
		
	}
}
