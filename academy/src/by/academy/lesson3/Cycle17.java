package by.academy.lesson3;

import java.util.Scanner;

public class Cycle17 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("������� ���������� ��������");
		int n= sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for (int i =0;i<n;i++) {
			System.out.println("������� ���� ���������� �������");
			arr[i]= sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("������� ���� = "+sum/n);
		sc.close();
	}

}
