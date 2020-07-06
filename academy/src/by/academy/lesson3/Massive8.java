package by.academy.lesson3;

public class Massive8 {

	public static void main(String[] args) {
		int arr[]=new int[12];
		for (int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*31)-15;
			System.out.print(arr[i]+" ");
		}
		int max=arr[0];
		int j = 0;
		for (int i=1;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
				j=i;
			}
		}
		System.out.println("\nМаксимальный элемент в массиве равен "+max+" и его индекс = "+j);
	}

}
