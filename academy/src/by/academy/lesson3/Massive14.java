package by.academy.lesson3;

public class Massive14 {

	public static void main (String[]ars) {
		
		int arr[][]=new int [8][5];
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*90)+10;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
