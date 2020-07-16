package by.academy.lesson5.newTasks.Task4;

public class Reader {

	private String fio;
	private int ticket;
	private String faculty;
	private String birthDay;
	private long phone;
	
	public Reader() {
		super();
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
			System.out.print(books[i].getName()+", ");
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
			System.out.print(books[i].getName()+", ");
		}
	}
	public void setFio(String fio) {
		this.fio=fio;
	}
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getFio() {
		return fio;
	}
	
}
	
