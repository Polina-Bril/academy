package by.academy.lesson3;

import java.util.Scanner;

public class Cycle4 {

	public static void main(String[] args) {
		
		System.out.println("������� �����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("����� ����� ������� "+n+" �����. ������ � ����� ������.");
		int nul=0;
		int pol=0;
		int otr=0;
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			System.out.println("������� �����");
			arr[i]=sc.nextInt();
			if (arr[i]==0) 
				nul++;
			else if (arr[i]>0)
					pol++;
			else if (arr[i]<0)
					otr++;
			}
		System.out.println("����� ��������� ����� "+pol+" - �������������, "+otr+" - �������������, "+nul+" - �����");
		sc.close();

	}

}
