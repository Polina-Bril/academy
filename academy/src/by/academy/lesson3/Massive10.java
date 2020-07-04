package by.academy.lesson3;

public class Massive10 {

	public static void main(String[] args) {
		int arr[]=new int [11];
		for (int i=0;i<arr.length; i++) {
			arr[i]=(int)(Math.random()*3)-1;
			System.out.print(arr[i]+" ");
		}
		int k = 0;
		int n = 0;
		int m = 0;
		for (int i = -1;i<=1;i++) {
			for (int j=0; j<arr.length;j++) {
				if (arr[j]==i) {
					switch (i) {
					case 0:
						n +=1;
						break;
					case -1:
						m+=1;
						break;
					default:
						k+=1;
					}
			}
		}

	}
		if (k>m&&k>n)
			System.out.println("\nВ массиве чаще всего ("+k+" раз) встречается 1");
		else if (m>k&&m>n)
			System.out.println("\nВ массиве чаще всего ("+m+" раз) встречается -1");
		else if (n>k&&n>m)
			System.out.println("\nВ массиве чаще всего ("+n+" раз) встречается 0");
}
}
