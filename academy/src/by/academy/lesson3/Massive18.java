package by.academy.lesson3;

public class Massive18 {

	public static void main(String[] args) {
			
		int k=0;
		for (int i=2;i<10;i++) {
			for (int j=i;j<10;j++) {
				k++;
			}
		}
			String arr[]=new String[k];
			int l=0;
			for (int i=2;i<10;i++) {
				for (int j=i;j<10;j++) {
					arr[l]=i+"*"+j;
					l++;
					}
				}
			int d = 15;
			int arr1[]=new int[15];
			int m;
			int b=0;
			int a =(int)(Math.random()*k);
			arr1[b]=a;
			System.out.println(arr[a]);
			for (int i=1;i<d;i++) {
				a =(int)(Math.random()*k);
				m=0;
				for (int j=0;j<b+1;j++) {
					if (a==arr1[j])
						m++;
				}
				if (m==0) {
					b++;
					arr1[b]=a;
					System.out.println(arr[a]);
				}else d++;
			}
		
		}
}
