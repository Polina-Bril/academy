package by.academy.lesson3;

public class Cycle20 {

	public static void main(String[] args) {
		
		int k,l;
		for (int i=10;i<=99;i++) {
			for (int j=10;j<=99;j++) {
				k = Integer.parseInt(String.valueOf(i) + String.valueOf(j));
				l = Integer.parseInt(String.valueOf(j) + String.valueOf(i));
				if(k%99==0&&l%49==0)
					System.out.println(i+" "+j);

	}
		}
	}

}
