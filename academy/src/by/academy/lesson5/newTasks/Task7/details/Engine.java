package by.academy.lesson5.newTasks.Task7.details;

public class Engine {

	private int mosch;
	private String proizvoditel;

	public Engine() {
		super();
	}

	public Engine(int mosch, String proizvoditel) {
		this.mosch = mosch;
		this.proizvoditel = proizvoditel;
	}

	public int getMosch() {
		return mosch;
	}

	public void setMosch(int mosch) {
		this.mosch = mosch;
	}

	public String getProizvoditel() {
		return proizvoditel;
	}

	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}

}
