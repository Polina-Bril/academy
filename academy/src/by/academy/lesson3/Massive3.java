package by.academy.lesson3;

public class Massive3 {

	public static void main(String[] args) {
		int arr []= new int[15];
		int n=0;
		for(int i=0; i<15; i++) {
			arr[i]=(int)(Math.random()*10);
			System.out.print(arr[i]+" ");
			if (arr[i]%2==0)
				n+=1;
		}
		System.out.println("\nВ массиве "+n+" четных элементовю");		

	}

}
