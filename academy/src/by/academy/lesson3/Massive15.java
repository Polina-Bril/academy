package by.academy.lesson3;

public class Massive15 {

	public static void main(String[] args) {
		
		int arr[][]=new int [5][8];
		int max = arr [0][0];
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*199)-99;
				System.out.print(arr[i][j]+" ");
				if (arr[i][j]>max)
					max=arr[i][j];
			}
			System.out.println();
		}
		System.out.println("Значение максимального элемента массива = "+max);
	}
}