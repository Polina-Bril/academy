package by.academy.lesson13;

public class Task4 {

//	Создать свое исключение CustomException.
//	Попробовать добавить в массив int на 8 элементов 10 чисел. 
//	Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
//	"Array is to small, expand the array". После чего выкинуть свое исключение CustomException.

	public static void main(String[] args) throws CustomException {
		int[] array = new int[8];
		try {
			for (int i = 0; i < 10; i++) {
				array[i] = (int) Math.random() * 10;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");
			throw new CustomException("It's my CustomException!");

		}

	}

}
