package by.academy.lesson3;

public class Massive6 {

	public static void main(String[] args) {
		int arr [] = new int [4];
		int n=0;
		for (int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*90)+10;
			System.out.print(arr[i]+" ");
		}
		for (int i=0; i<arr.length-1;i++) {
			if (arr[i]<arr[i+1])
				n++;
		}
		if (n==arr.length-1)
			System.out.println("\nМассив является строго восходящей последовательностью");
		else 
			System.out.println("\nМассив НЕ является строго восходящей последовательностью");
	}

}
