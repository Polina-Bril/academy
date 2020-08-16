package by.academy.homework.homework4.task4;

public class CustomException extends Exception {

	private static final long serialVersionUID = 6857419533223205235L;

	public CustomException() {
		super();
	}

	public CustomException(String saySmth) {
		super(saySmth);
	}
}
