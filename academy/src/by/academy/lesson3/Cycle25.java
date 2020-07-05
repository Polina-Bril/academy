package by.academy.lesson3;

public class Cycle25 {

	public static void main(String[] args) {
		
		double a=55.5;
		int n = 20;
		double sum =0;
		double proizved=1;
		for (int i=0;i<n;i++) {
			sum=a+i;
			proizved*=sum;
		}
		System.out.println(proizved);
	}
}
