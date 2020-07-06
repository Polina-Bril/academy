package by.academy.lesson3;

public class Cycle16 {

	public static void main(String[] args) {

		int n = 50;
		int m = 60;
		int sum = m;
		for (int i=2;i<=n;i++) {
			m+=10;
			sum +=m;
		}
		int min=sum%60;
		int h=(sum-min)/60;
		System.out.print(h+" часов "+min+" минут");
	}

}
