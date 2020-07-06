package by.academy.lesson3;

public class Massive17 {

	public static void main(String[] args) {
		
		int arr[][]=new int [6][7];
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*10);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int max = 0;
		for (int i=0;i<arr.length;i++) {
			max = 0;
			for (int j=0;j<arr[i].length;j++) {
				if (arr[i][j]>arr[i][max]) 
					max=j;
					}
			int a = arr[i][max];
			arr[i][max]=arr[i][0];
			arr[i][0]=a;
					}
		System.out.println();
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
