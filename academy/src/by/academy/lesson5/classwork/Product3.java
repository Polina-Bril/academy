package by.academy.lesson5.classwork;

public class Product3  extends Product{
	double skidka1=30;
	
	public void setPrice (double price) {
		this.price=price*(1-skidka1/100);
	}
	public double getPrice() {
		return price;
	}

}