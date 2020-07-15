package by.academy.lesson5.classwork;

public class Product2 extends Product{
	double skidka2=50;
	
	public void setPrice (double price) {
		this.price=price*(1-skidka2/100);
	}
	public double getPrice() {
		return price;
	}

}
 