package by.academy.lesson5.newTasks.Task1;

public class Phone {
	private long number;
	private double weight;
	private String model;

	public Phone() {
		super();
	}

	public Phone(long number, String model, double weight) {
		this(number, model);
		this.weight = weight;
	}

	public Phone(long number, String model) {
		this.number = number;
		this.model = model;
	}

	public void receiveCall(String name) {
		System.out.println("Звонит " + name);
	}

	public void receiveCall(String name, long number) {
		System.out.println("Звонит " + name);
	}

	public void sendMessage(long... Numbers) {
		System.out.print("Отправляем сообщение следующим номерам: ");
		for (int i = 0; i < Numbers.length; i++) {
			System.out.print(Numbers[i] + " ");
		}
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getNumber() {
		return number;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
}
