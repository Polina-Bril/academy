package by.academy.lesson3;

public class Massive16 {

	public static void main(String[] args) {
		
		int arr[][]=new int [7][4];
		int proizvedenie ;
		int max = 0;
		int k = 0;
		for (int i=0;i<arr.length;i++) {
			proizvedenie = 1;
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*11)-5;
				System.out.print(arr[i][j]+" ");
				proizvedenie*=Math.abs(arr[i][j]);
				if (proizvedenie>max) {
					max=proizvedenie;
					k=i;
				}
			}
			System.out.println();
		}
		System.out.println("Наибольшее по модулю произведение элементов в строке с индексом "+k);
	}
}