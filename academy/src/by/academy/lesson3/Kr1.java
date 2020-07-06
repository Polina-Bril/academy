package by.academy.lesson3;

public class Kr1 {

	public static void main(String[] args) {
		
		int n = 15;
		int arr[] = new int [n];
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*n);
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		int min = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max)
				max=arr[i];
			if (arr[i]<min)
				min=arr[i];
		}
		System.out.println("\nMax = "+max+", min = "+min);
		int sum=0;
		int j=0;
		int k=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==max&&j<1)
				j++;
			else if (arr[i]==min&&k<1)
				k++;
			else sum+=arr[i];
		}
		System.out.println("Sum = "+sum);
			
	}

}
