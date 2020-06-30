package by.academy.lesson2;

public class Task3 {

	public static void main(String[] args) {
		int range = 1000;
		int a = (int)( Math.random()*range);
		if (a%2==0) {
			System.out.println(a+" - четное");
			} else {
				System.out.println(a+" - нечетное");
			}
				

	}

}
