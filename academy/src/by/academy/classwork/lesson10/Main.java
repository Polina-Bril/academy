package by.academy.classwork.lesson10;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		MinMax<Integer> iob = new MinMax<>(intArray);
		System.out.println("������������ �������� ��� Integer " + iob.maximum());
		System.out.println("����������� �������� ��� Integer " + iob.minimum());

		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		MinMax<Double> dob = new MinMax<>(doubleArray);
		System.out.println("������������ �������� ��� Double " + dob.maximum());
		System.out.println("����������� �������� ��� Double " + dob.minimum());

		Float[] floatArray = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		MinMax<Float> fob = new MinMax<>(floatArray);
		System.out.println("������������ �������� ��� Float " + fob.maximum());
		System.out.println("����������� �������� ��� Float " + fob.minimum());
		
		System.out.print("������������ �������� ��� iob � dob ");
		if (iob.sameMaximum(dob)) {
			System.out.println("����������.");
		} else {
			System.out.println("������.");
		}

		System.out.print("������������ �������� ��� iob � fob ");
		if (iob.sameMaximum(fob)) {
			System.out.println("����������.");
		} else {
			System.out.println("������.");
		}
		System.out.print("����������� �������� ��� iob � dob ");
		if (iob.sameMinimum(dob)) {
			System.out.println("����������.");
		} else {
			System.out.println("������.");
		}

		System.out.print("����������� �������� ��� iob � fob ");
		if (iob.sameMinimum(fob)) {
			System.out.println("����������.");
		} else {
			System.out.println("������.");
		}
	}



}
