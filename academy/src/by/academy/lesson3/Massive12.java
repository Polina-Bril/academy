package by.academy.lesson3;

import java.util.Arrays;

public class Massive12 {

	public static void main(String[] args) {
		int arr [] = new int [12];
		int n;
		do{
			n=6;
			for (int i=0;i<arr.length; i++) {
			do{
				arr[i]=(int)(Math.random()*21)-10;
			}while (arr[i]==0);
			if (arr[i]<0) {
				n--;
		}
		}
		}while (n!=0);
					
		String arrString = Arrays.toString(arr);
		System.out.println(arrString);
		}
		}



