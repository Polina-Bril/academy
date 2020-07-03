package by.academy.lesson3;

public class Massive4 {

	public static void main(String[] args) {
		int arr []= new int[8];
		for(int i=0; i<8; i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
					}
		for(int i=1; i<8; i+=2) {
			arr[i]=0;
		}
		System.out.println("");
		for(int i=0; i<8; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
