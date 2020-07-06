package by.academy.lesson3;

public class Cycle6 {

	public static void main(String[] args) {
		
		int n = 10;
		int proc=3;
		double rub=5;
		for (int i=1;i<=n;i++) {
			rub+=rub*0.03;
		}
			System.out.println(rub+" рублей через "+n+" лет");
	

	}

}
