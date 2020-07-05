package by.academy.lesson3;

public class Cycle26 {

	public static void main(String[] args) {

		double a=55.5;
		int n = 20;
		double sum =0;
		double b=0;
		for (int i=1;i<=n;i++) {
			b=Math.sin(Math.pow(a, i));
			sum+=b;
			
		}
		System.out.println(sum);

	}

}
