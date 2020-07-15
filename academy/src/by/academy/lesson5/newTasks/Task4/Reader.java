package by.academy.lesson5.newTasks.Task4;

public class Reader {

	String fio;
	int ticket;
	String faculty;
	String birthDay;
	long phone;
	
	public Reader() {
		
	}
	public void takeBook(int n) {
		System.out.println(fio+" взял "+n+" книг");
		
	}
	public void takeBook(String... Knigi) {
		System.out.print(fio+" взял книги: ");
		for (int i=0; i<Knigi.length; i++) {
			System.out.print(Knigi[i]+", ");
		}
	}
	public void takeBook(Book... books) {
		System.out.print(fio+" взял книги: ");
		for (int i=0; i<books.length; i++) {
			System.out.print(books[i].name+", ");
		}
	}
	public void returnBook(int n) {
		System.out.println(fio+" вернул "+n+" книг");
	}
	public void returnBook(String... Knigi) {
		System.out.print(fio+" вернул книги: ");
		for (int i=0; i<Knigi.length; i++) {
			System.out.print(Knigi[i]+", ");
		}
	}
	public void returnBook(Book... books) {
		System.out.print(fio+" вернул книги: ");
		for (int i=0; i<books.length; i++) {
			System.out.print(books[i].name+", ");
		}
	}
	public void setFio(String fio) {
		this.fio=fio;
	}
}
	
