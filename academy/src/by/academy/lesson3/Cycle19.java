package by.academy.lesson3;

public class Cycle19 {

	public static void main(String[] args) {
		
		int k;
		for (int i=10;i<=99;i++) {
			for (int j=10;j<=99;j++) {
				k = Integer.parseInt(String.valueOf(i) + String.valueOf(j));
				if(k%(i*j)==0)
					System.out.println(i+" "+j);
		}
		}

	}

}
