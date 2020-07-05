package by.academy.lesson3;

public class Cycle31 {

	public static void main(String[] args) {
		
		int m = 150;
		int k = 3;
		int i=0;
		while (m>=k) {
			i++;
			m-=k;
		}
		System.out.println("Материала не хватает. Осталось "+m+" метров");
	}

}
