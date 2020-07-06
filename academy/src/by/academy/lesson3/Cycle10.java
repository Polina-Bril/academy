package by.academy.lesson3;

public class Cycle10 {

	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1;i<=50;i++) {
			if (i%7==0||i%5==0)
				sum+=i;
		}
				System.out.print(sum);
		

	}

}
