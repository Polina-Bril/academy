package by.academy.lesson3;

public class Massive1 {

	public static void main(String[] args) {
		int even[] = new int[10];
		int j = 0;
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				even[j] = i;
				System.out.print(even[j] + " ");
				j++;
			}
		}
		System.out.println(" ");
		for (int i = 0; i < 10; i++) {
			System.out.println(even[i]);
		}
	}
}
