package by.academy.lesson10;

//Вложенные классы. Дженерики. Задание 2
//Переписать предыдущее задание, используя локальный класс. 

public class User_1 {
	private String login;
	private String password;

	public User_1() {
		super();
		login = "Вася";
		password = "Буль-буль";
	}

	public User_1(String login, String password) {
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

	void createQuery() {

		class Querry {

			public Querry() {
				super();
			}

			void printToLog() {

				System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос ");
			}
		}
		Querry querry = new Querry();
		querry.printToLog();
	}

	public static void main(String... args) {
		User_1 user = new User_1("dashulia", "123456");
		user.createQuery();
		new User_1().createQuery();
	}
}
