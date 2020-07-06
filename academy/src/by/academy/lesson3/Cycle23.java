package by.academy.lesson3;

public class Cycle23 {

	public static void main(String[] args) {

		double n= Math.pow(2, 10);
		int sum =0;
		for (int i=1;i<=n;i*=2) {
			sum+=i;
		}
		System.out.print(sum);

	}

}
