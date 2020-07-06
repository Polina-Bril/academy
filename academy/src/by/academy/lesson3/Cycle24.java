package by.academy.lesson3;

public class Cycle24 {

	public static void main(String[] args) {
		
		int sum = 0;
		long proizved= 1;
		for (int i=2;i<=10;i++) {
			sum=0;
			for(int j=1;j<=i;j++) {
				sum+=j;
			}
			proizved*=sum;
		}
		System.out.println(proizved);
	}

}
