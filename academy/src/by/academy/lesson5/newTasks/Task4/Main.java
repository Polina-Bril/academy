package by.academy.lesson5.newTasks.Task4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=5;
		int n,m;
		Scanner sc = new Scanner(System.in);
		Reader [] ona = new Reader [a];
		for (int i=0; i<a; i++) {
			Reader one = new Reader();
			ona[i]= one;
			System.out.println("Введите ФИО следующего читателя");
			ona[i].setFio(sc.nextLine());
			n=(int)(Math.random()*5);
			ona[i].takeBook(n);
			String knigi[]=new String[n];
			Book books []= new Book[n];
			for (int j=1;j<=n;j++) {
				System.out.println("Введите название "+j+" книги");
				String s=sc.nextLine();
				knigi[j-1]=s;
				Book bro= new Book();
				books[j-1]=bro;
				books[j-1].name=s;
		}
			ona[i].takeBook(knigi);
			System.out.println();
			ona[i].takeBook(books);
			System.out.println();
			m=(int)(Math.random()*5);
			ona[i].returnBook(m);
			String knigi1[]=new String[m];
			Book books1 []= new Book[m];
			for (int j=1;j<=m;j++) {
				System.out.println("Введите название "+j+" книги");
				String s=sc.nextLine();
				knigi1[j-1]=s;
				Book bro= new Book();
				books1[j-1]=bro;
				books1[j-1].name=s;
		}
			ona[i].returnBook(knigi1);
			System.out.println();
			ona[i].returnBook(books1);
		
		System.out.println();
		}
		
		sc.close();
	}
}
