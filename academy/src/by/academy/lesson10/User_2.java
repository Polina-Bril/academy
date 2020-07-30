package by.academy.lesson10;

//Вложенные классы. Дженерики. Задание 3
//Переписать класс Query используя статический класс.

public class User_2 {
	private static String login;
	private static String password;

	public User_2() {
		super();
		login = "Вася";
		password = "Буль-буль";
	}

	public User_2(String login, String password) {
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

	static class Querry {

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
		User_2 user = new User_2();
		user.createQuery();
		Querry querry1 = new Querry();
		querry1.printToLog();
		User_2 user1 = new User_2("dashulia", "123456");
		Querry querry2 = new Querry();
		querry2.printToLog();

	}
}
