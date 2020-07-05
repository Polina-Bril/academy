package by.academy.lesson3;

public class Cycle21 {

	public static void main(String[] args) {

		int n= 25;
		double m=0;
		for (int i=2;i<=2*n;i+=2) {
			m+=(double)1/(i*i);
		}
		System.out.print(m);
	}

}
