package by.academy.homework.homework6.task2;

import java.util.Date;

public class User extends Person {

	public String login;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String firstName, String lastName, int age, String dateOfBirth) {
		super(firstName, lastName, age, dateOfBirth);
	}

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password,
			String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String printUserInfo() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + ", first name=" + firstName
				+ ", last name=" + lastName + ", age=" + age + ", date of Birth=" + getDateOfBirth() + "]";
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + "]";
	}

}
