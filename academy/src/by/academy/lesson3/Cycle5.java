package by.academy.lesson3;

public class Cycle5 {

	public static void main(String[] args) {
		
		String arr1[]= {"�������", "������", "�����", "�������", "������", "������", "�������", "����������", "������"};
		String arr2[]= {"������", "�����������", "������", "�����", "�����", "���������", "������", "�����", "�����������"};
		double arr3[]= {2.1366, 2.5, 0.3048, 3.7325, 29.86, 0.40951, 0.7112, 4.2657, 25.3995};
		for (int i=0;i<9;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println("� "+j+" "+arr1[i]+" "+j*arr3[i]+" "+arr2[i]);
			}
		}

	}

}
