package by.academy.lesson3;

public class Cycle28 {

	public static void main(String[] args) {
		
		float proc= 0.2f;
		double m = 100000;
		double s = 200000;
		int i=0;
		while (s>m) {
			i++;
			m*=1.2;
		}
		System.out.println("m превысит s через "+i+" лет");
	}

}
