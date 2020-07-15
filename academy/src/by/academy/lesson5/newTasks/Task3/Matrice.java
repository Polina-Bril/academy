package by.academy.lesson5.newTasks.Task3;

public class Matrice {
	
	int strok;
	int stolbcov;
	double [][] massive= new double [strok][stolbcov];
	
	public Matrice() {
		
	}
	public Matrice(int strok, int stolbcov, double[][]massive) {
		this.strok=strok;
		this.stolbcov=stolbcov;
		this.massive=massive;
	}
	public void sumMatric(double [][] matric, int strok, int stolbcov) {
		if(this.strok==strok&&this.stolbcov==stolbcov) {
		for(int i = 0;i<massive.length;i++) {
			for (int j=0; j<massive[i].length;j++) {
				massive[i][j]+=matric[i][j];			
				System.out.print(massive[i][j]+" ");
			}
			System.out.println();
		}}
		else System.out.println("Сложение невозможно. Матрицы разных размеров!");
	}
	public void umnozh(int n) {
		for(int i = 0;i<massive.length;i++) {
			for (int j=0; j<massive[i].length;j++) {
				massive[i][j]*=n;			
				System.out.print(massive[i][j]+" ");
			}
			System.out.println();
		}}
	public void print() {
		for(int i = 0;i<massive.length;i++) {
			for (int j=0; j<massive[i].length;j++) {
				System.out.print(massive[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void proizvedMatric(double [][] matric, int strok, int stolbcov) {
		if(this.strok==strok&&this.stolbcov==stolbcov) {
		for(int i = 0;i<massive.length;i++) {
			for (int j=0; j<massive[i].length;j++) {
				massive[i][j]*=matric[i][j];			
				System.out.print(massive[i][j]+" ");
			}
			System.out.println();
		}}
		else System.out.println("Произведение невозможно. Матрицы разных размеров!");
	}
}
