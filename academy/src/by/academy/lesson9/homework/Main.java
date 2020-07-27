package by.academy.lesson9.homework;

public class Main {

	public static void main(String[] args) {
		
		Array<String> arrString = new Array<>();
		String arrayString[] = {"Мама", "Папа", "Саша", "Даша"};
		arrString.setItems(arrayString);
		System.out.println(arrString.getIndex("Саша"));
		arrString.getElement(3);
		System.out.print(arrString.addToEnd("Янка", arrayString));
		
		Array<Integer> arrInt = new Array<>();
		Integer [] arrayInt= {10, 15, 20};
		arrInt.setItems(arrayInt);
		System.out.println(arrInt.getIndex(10));
		arrInt.getElement(3);

	}

}
