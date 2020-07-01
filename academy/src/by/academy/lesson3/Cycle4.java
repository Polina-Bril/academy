package by.academy.lesson3;

import java.util.Scanner;

public class Cycle4 {

	public static void main(String[] args) {
		System.out.println("Введите число!");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int otricatelnye = 0;
		int polozhitelnye = 0;
		int nol=0;
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Введите число");
			arr[i]=sc.nextInt();
			if (arr[i]<0) {
				otricatelnye++;
			} else if (arr[i]==0) {
				nol++;
			} else polozhitelnye++;
							}
		System.out.println("Положительных чисел - "+polozhitelnye+", отрицательных чисел - "+otricatelnye+", значений равных нулю - "+nol);
	}

}