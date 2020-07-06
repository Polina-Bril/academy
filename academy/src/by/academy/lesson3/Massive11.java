package by.academy.lesson3;

import java.util.Scanner;

public class Massive11 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Введите четное положительное число");
		n = sc.nextInt();
		} while (n%2!=0||n<=0);
		
		int arr[]=new int [n];
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*11)-5;
			System.out.print(arr[i]+" ");
			}
		int sum1=0;
		int sum2=0;
		for (int i=0;i<arr.length/2;i++) {
			sum1+=Math.abs(arr[i]);
		}
		for (int i=arr.length/2;i<arr.length;i++) {
			sum2+=Math.abs(arr[i]);
		}
		if (sum1>sum2)
			System.out.println("\nСумма модулей первой половины массива больше, чем сумма модулей второй половины");
		else if (sum1<sum2)
			System.out.println("\nСумма модулей второй половины массива больше, чем сумма модулей первой половины");
		else
			System.out.println("\nСумма модулей первой и второй половины массива равны");
		
		sc.close();
	}

}
