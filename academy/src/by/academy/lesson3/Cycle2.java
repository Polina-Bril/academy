package by.academy.lesson3;

import java.util.Scanner;

public class Cycle2 {

	public static void main(String[] args) {
		System.out.println("¬ведите число!");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		for(int i=1;i<(n+1);i++) {
			sum+=i;
			}
		System.out.println(sum);
		sc.close();
	}

}
