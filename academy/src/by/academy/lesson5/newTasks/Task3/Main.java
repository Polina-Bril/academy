package by.academy.lesson5.newTasks.Task3;

public class Main {

	public static void main(String[] args) {
		int stroka = 3;
		int stolbcovv = 2;
		double[][]one = {{1.1, 1.2, 1.3},{2.1, 2.2, 2.3,},{3.1, 3.2, 3.3}};
		int stroka2 = 3;
		int stolbcovv2 = 2;
		double[][]two = {{10, 100, 10},{100, 10, 1,},{100, 1, 10}};
		Matrice ona = new Matrice();
		ona.setMassive(one);
		ona.setStrok(stroka);
		ona.setStolbcov(stolbcovv);
		ona.print();
		System.out.println();
		ona.umnozh(10);
		System.out.println();
		ona.sumMatric(two, stroka2, stolbcovv2);
		System.out.println();
		ona.proizvedMatric(two, stroka2, stolbcovv2);
		

	}

}
