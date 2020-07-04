package by.academy.lesson3;

import java.util.Scanner;

public class Massive13 {

	public static void main(String[] args) {
		double n;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("¬ведите натуральное число больше 3");
		n = sc.nextDouble();
		if (n!=(int)n)
			System.out.println("„исло должно быть целым!");
		} while (n<3||n!=(int)n);
		
		int m = (int)n;
		int j=0;
		int arr[]=new int [m];
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*(m+1));
			System.out.print(arr[i]+" ");
			if (arr[i]%2==0) 
				j+=1;
			}
		System.out.print("\n");
		int k=0;
		if (j>0) {
			int arr1[]=new int [j];
			for (int i=0;i<arr.length;i++) {
				if (arr[i]%2==0) {
					arr1[k]=arr[i];
					System.out.print(arr1[k]+" ");
					k++;
				}
			}
		}
		sc.close();
	}

}
