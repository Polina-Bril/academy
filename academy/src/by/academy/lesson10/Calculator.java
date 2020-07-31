package by.academy.lesson10;

public class Calculator {

	static <T extends Number, E extends Number> double sum(T x, E y) {
		return x.doubleValue() + y.doubleValue();
	}

	static <T extends Number, E extends Number> double substraction(T x, E y) {
		return x.doubleValue() - y.doubleValue();
	}

	static <T extends Number, E extends Number> double multiply(T x, E y) {
		return x.doubleValue() * y.doubleValue();
	}

	static <T extends Number, E extends Number> double devision(T x, E y) {
		return x.doubleValue() / y.doubleValue();
	}
}
