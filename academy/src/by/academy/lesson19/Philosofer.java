package by.academy.lesson19;

import java.util.ArrayList;

public class Philosofer implements Runnable {

	private static ArrayList<Philosofer> philosofers;
	private int numberOfSeat;
	private Fork rightFork;
	private Fork leftFork;
	private static int countPhilosofers = 0;

	public Philosofer() {
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
		synchronized (rightFork) {
			synchronized (leftFork) {
				while (true) {
					System.out.println("Философ " + numberOfSeat + " берет правую вилку");
					System.out.println("Философ " + numberOfSeat + " берет левую вилку");
					System.out.println("Философ " + numberOfSeat + " ест");
					System.out.println("Философ " + numberOfSeat + " кладет правую вилку");
					rightFork.notifyAll();
					System.out.println("Философ " + numberOfSeat + "  кладет левую вилку");
					leftFork.notifyAll();
					System.out.println("Философ " + numberOfSeat + " размышляет");
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
