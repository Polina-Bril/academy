package by.academy.lesson19;

public class Fork {
	
	private int number;
	private volatile boolean isOnTable;

	public Fork(int number) {
		super();
		this.number = number;
		isOnTable = true;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isOnTable() {
		return isOnTable;
	}

	public void setOnTable(boolean isOnTable) {
		this.isOnTable = isOnTable;
	}
	

}
