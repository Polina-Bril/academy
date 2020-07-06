package by.academy.lesson3;

public class Kr3 {

	public static void main(String[] args) {
		
		int n = 15;
		int arr[] = new int [n];
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*n);
			System.out.print(arr[i]+" ");
		}
		int max = 0;
		int m = arr[0];
		int k;
		int l;
		for (int i=0;i<arr.length;i++) {
			k = arr[i];
			l = 0;
			for (int j=0;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					l++;
					if (l>max) {
						max=l;
						m = arr[i];
					}
		}}}
		if (max==1)
			System.out.println("\nНи одно из чисел в массиве не повторяется");
		else 
			System.out.println("\nЧисло "+m+" повторяется максимальное количество раз ("+max+" раз)");

	}
}
