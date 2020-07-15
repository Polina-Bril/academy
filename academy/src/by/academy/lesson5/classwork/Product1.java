package by.academy.lesson5.classwork;

public class Product1  extends Product{
	double skidka1=10;
	
	public void setPrice (double price) {
		this.price=price*(1-skidka1/100);
	}
	public double getPrice() {
		return price;
	}

}
