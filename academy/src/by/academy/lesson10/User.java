package by.academy.lesson10;

//Вложенные классы. Дженерики. Задание 1
//Создать класс User, содержащий private переменные login, password. 
//Создать внутренний класс Query в классе User. 
//Класс Query содержит метод printToLog(), который распечатывает на консоль 
//сообщение о том что пользователь с таким то логином и паролем отправил запрос. 
//Класс User, содержит метод createQuery(), в котором создается объект класса 
//Query и вызывается метод printToLog(). В методе main(): создать экземпляр класса 
//User и вызвать метод createQuery(); создать экземпляр класса Query и вызвать метод 
//printToLog() используя конструкцию user.new Query(); создать экземпляр класса 
//Query и вызвать метод printToLog() используя конструкцию new User().new Query();

public class User {
	private String login;
	private String password;

	public User() {
		super();
		login = "Вася";
		password = "Буль-буль";
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	class Querry {
		
		public Querry() {
			super();
		}

		void printToLog() {
			System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос ");
		}
	}

	void createQuery() {
		Querry querry = new Querry();
		querry.printToLog();
	}

	public static void main(String... args) {
		User user = new User("dashulia", "123456");
		user.createQuery();
		Querry querry1 = user.new Querry();
		querry1.printToLog();
		Querry querry2 = new User().new Querry();
		querry2.printToLog();

	}
}
