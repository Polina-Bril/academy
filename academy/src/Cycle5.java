
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
					System.out.println("в " + i + " саженях " + arr[j] * i + " метров ");
				break;
				case (1):
					System.out.println("в " + i + " дюймах " + arr[j] * i + " сантиметров ");
				break;
				case (2):
					System.out.println("в " + i + " футах " + arr[j] * i + " метров ");
				break;
				case (3):
					System.out.println("в " + i + " драхм " + arr[j] * i + " грамм ");
				break;
				case (4):
					System.out.println("в " + i + " унциях " + arr[j] * i + " грамм ");
				break;
				case (5):
					System.out.println("в " + i + " фунтах " + arr[j] * i + " килограмм ");
				break;
				case (6):
					System.out.println("в " + i + " аршинах " + arr[j] * i + " метров ");
				break;
				case (7):
					System.out.println("в " + i + " саженей " + arr[j] * i + " метров ");
				break;
				casce (8):
					System.out.println("в " + i + " саженей " + arr[j] * i + " метров ");
				break;
				default
				break;
					
				}
				System.out.println("в " + i + " саженей " + arr[j] * i + " метров ");
				// System.out.println(arr[j] * i);
			}
		}

	}

	private static void Switch(int j) {
		// TODO Auto-generated method stub
		
	}

}
