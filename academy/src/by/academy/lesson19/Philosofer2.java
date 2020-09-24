package by.academy.lesson19;

import java.util.ArrayList;

public class Philosofer2 implements Runnable {

	private static ArrayList<Philosofer2> philosofers;
	private int numberOfSeat;
	private Fork rightFork;
	private Fork leftFork;
	private static int countPhilosofers = 0;

	public Philosofer2() {
		super();
		countPhilosofers++;
		numberOfSeat = countPhilosofers;
		if (countPhilosofers > 2) {
			philosofers.add(this);
			philosofers.get(numberOfSeat - 1 - 1).setLeftFork(new Fork(numberOfSeat));
			rightFork = philosofers.get(numberOfSeat - 1 - 1).leftFork;
			leftFork = philosofers.get(0).rightFork;
		} else if (countPhilosofers == 1) {
			philosofers = new ArrayList<>();
			philosofers.add(this);
			rightFork = new Fork(1);
			leftFork = new Fork(2);
		} else {
			philosofers.add(this);
			rightFork = philosofers.get(0).getLeftFork();
			leftFork = philosofers.get(0).rightFork;
		}

	}

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public Fork getRightFork() {
		return rightFork;
	}

	public void setRightFork(Fork rightFork) {
		this.rightFork = rightFork;
	}

	public Fork getLeftFork() {
		return leftFork;
	}

	public void setLeftFork(Fork leftFork) {
		this.leftFork = leftFork;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (rightFork) {
				synchronized (leftFork) {

					takeRightFork();
					takeLeftFork();
					eating();
					returnRightFork();
					returnLeftFork();
				}
			}
			thinking();
		}
	}

	private void eating() {
		System.out.println("Философ " + numberOfSeat + " ест");
		try {
			this.wait(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void thinking() {
		System.out.println("Философ " + numberOfSeat + " размышляет");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void returnLeftFork() {
		System.out.println("Философ " + numberOfSeat + "  кладет левую вилку");
		leftFork.setOnTable(true);
		this.notifyAll();
	}

	private void returnRightFork() {
		System.out.println("Философ " + numberOfSeat + " кладет правую вилку");
		rightFork.setOnTable(true);
		this.notifyAll();

	}

	private void takeLeftFork() {
		if (leftFork.isOnTable()) {
			System.out.println("Философ " + numberOfSeat + " берет левую вилку");
			leftFork.setOnTable(false);
		} else {
			returnRightFork();
			thinking();
		}
	}

	private void takeRightFork() {
		if (rightFork.isOnTable()) {
			System.out.println("Философ " + numberOfSeat + " берет правую вилку");
			rightFork.setOnTable(false);
		} else {
			thinking();
		}
	}

}
