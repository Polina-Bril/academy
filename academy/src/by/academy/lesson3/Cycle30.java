package by.academy.lesson3;

public class Cycle30 {

	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		while (i<100) {
			sum+=i;
			i+=2;
		}
		System.out.print(sum);
	}

}
