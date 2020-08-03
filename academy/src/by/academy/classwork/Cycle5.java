package by.academy.classwork;

public class Cycle5 {

	public static void main(String[] args) {

		double[] arr = new double[9];

		arr[0] = 2.1366;
		arr[1] = 2.5;
		arr[2] = 0.3048;
		arr[3] = 3.7325;
		arr[4] = 29.86;
		arr[5] = 0.40951;
		arr[6] = 0.7112;
		arr[7] = 4.2657;
		arr[8] = 25.3995;

		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 9; j++) {
				switch (j) {
				case (0):
					System.out.println("� " + i + " ������� " + arr[j] * i + " ������ ");
				break;
				case (1):
					System.out.println("� " + i + " ������ " + arr[j] * i + " ����������� ");
				break;
				case (2):
					System.out.println("� " + i + " ����� " + arr[j] * i + " ������ ");
				break;
				case (3):
					System.out.println("� " + i + " ����� " + arr[j] * i + " ����� ");
				break;
				case (4):
					System.out.println("� " + i + " ������ " + arr[j] * i + " ����� ");
				break;
				case (5):
					System.out.println("� " + i + " ������ " + arr[j] * i + " ��������� ");
				break;
				case (6):
					System.out.println("� " + i + " ������� " + arr[j] * i + " ������ ");
				break;
				case (7):
					System.out.println("� " + i + " ������� " + arr[j] * i + " ������ ");
				break;
				casce (8):
					System.out.println("� " + i + " ������� " + arr[j] * i + " ������ ");
				break;
				default
				break;
					
				}
				System.out.println("� " + i + " ������� " + arr[j] * i + " ������ ");
				// System.out.println(arr[j] * i);
			}
		}

	}

	private static void Switch(int j) {
		// TODO Auto-generated method stub
		
	}

}
