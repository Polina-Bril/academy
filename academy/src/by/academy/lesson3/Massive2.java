package by.academy.lesson3;

public class Massive2 {

	public static void main(String[] args) {
		int arr[]=new int[50];
		int j=0;
		for(int i=1;i<=99;i++) {
			if(i%2==1) {
				arr[j]=i;
				System.out.print(arr[j]+" ");
				j++;
			}
		}
		System.out.println("");
		for(int i=50-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
	}
	}
}


