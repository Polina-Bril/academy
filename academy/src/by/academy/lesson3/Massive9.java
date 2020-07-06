package by.academy.lesson3;

import java.util.Arrays;

public class Massive9 {

	public static void main(String[] args) {
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		double arr3[]= new double [10];
		int n = 0;
		for (int i=0;i<10;i++) {
			arr1[i]=(int)(Math.random()*9)+1;
			arr2[i]=(int)(Math.random()*9)+1;
			arr3[i]=(double)arr1[i]/arr2[i];
			System.out.print(arr1[i]+" ");
			if (arr3[i] == (int)arr3[i])
				n++;
		}
		String arr2String = Arrays.toString(arr2);
		String arr3String = Arrays.toString(arr3);
		System.out.print("\n");
		System.out.println(arr2String);
		System.out.println(arr3String);
		System.out.println("Количество целых элементов в третьем массиве равно "+n);
	}

}
