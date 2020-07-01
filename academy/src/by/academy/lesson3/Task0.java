package by.academy.lesson3;

import java.lang.reflect.Array;
import java.util.Random;

public class Task0 {

	public static void main(String[] args) {
		int n=1000;
		int sum = 0;
		int[] arr = new int [n];
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			arr[i]=rand.nextInt(n);
			sum+=arr[i];
		}
		int srednee=sum/n;
		System.out.println(srednee);
		for (int element:arr) {
			if (element<srednee) {
				System.out.println(element);
			}
		}

	}

}
