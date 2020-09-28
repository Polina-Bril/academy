package by.academy.lesson20;

import java.util.Date;

public class Card {

	private String issuer;
	private Long cardNo;
	private Date expiryDate;
	private int sumOnCard;

	public boolean authorise(double amount) {
		if (amount < sumOnCard) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Card [issuer=" + issuer + ", cardNo=" + cardNo + ", expiryDate=" + expiryDate + ", sumOnCard="
				+ sumOnCard + "]";
	}
	
}
