package by.academy.lesson3;

public class Cycle12 {

	public static void main(String[] args) {

		int proizved=1;
		for (int i=10;i<=99;i++) {
			if (i%2==1&&i%13==0)
				proizved*=i;
		}
				System.out.print(proizved);

	}

}
