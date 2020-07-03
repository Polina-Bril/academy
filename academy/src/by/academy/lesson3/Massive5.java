package by.academy.lesson3;

public class Massive5 {

	public static void main(String[] args) {
		int arr1 []= new int[5];
		int n=0;
		for(int i=0; i<5; i++) {
			arr1[i]=(int)(Math.random()*6);
			System.out.print(arr1[i]+" ");
			n+=arr1[i];

	}
		System.out.println("");
		int arr2 []= new int[5];
		int m=0;
		for(int i=0; i<5; i++) {
			arr2[i]=(int)(Math.random()*6);
			System.out.print(arr2[i]+" ");
			m+=arr2[i];
}
		double nn=(double)n/5;
		double mm=(double)m/5;
		System.out.println("\nСреднее арифметическое 1го диапазона = "+nn);
		System.out.println("Среднее арифметическое 2го диапазона = "+mm);
		if (nn>mm)
			System.out.println("Среднее арифметическое 1го диапазона больше");
		else if (nn==mm)
			System.out.println("Средние арифметические обоих диапазонов равны");
		else System.out.println("Среднее арифметическое 2го диапазона больше");
	}
}