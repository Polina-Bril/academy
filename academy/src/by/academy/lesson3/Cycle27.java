package by.academy.lesson3;

public class Cycle27 {

	public static void main(String[] args) {
		
		int m = 100;
		int k= 15;
		int i=0;
		while (m>=k) {
			i++;
			m-=k;
		}
		System.out.println("Петя съел "+i+" мороженных, и у него осталось "+m+" рублей");
	}

}
