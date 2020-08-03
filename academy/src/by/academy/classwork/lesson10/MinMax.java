package by.academy.classwork.lesson10;

//8. ���������� ������. ���������
//�������� ���������� ����� MinMax, ������� �������� ������ ��� ���������� ������������ � ������������� �������� �������. 
//������ �������� ���������� ������. ������ ������ ������������ � ����� ����� �����������.

public class MinMax<T extends Number> {

	private T[] array;

	public MinMax(T[] array) {
		this.array = array.clone();
	}

	public double minimum() {
		double min = array[0].doubleValue();
		for (T value : array) {
			if (value.doubleValue() < min) {
				min = value.doubleValue();
				;
			}
		}

		return min;
	}

	public double maximum() {
		double max = array[0].doubleValue();
		for (T value : array) {
			if (value.doubleValue() > max) {
				max = value.doubleValue();
				;
			}
		}

		return max;
	}

	boolean sameMinimum(MinMax<?> ob) {
		return minimum() == ob.minimum();
	}

	boolean sameMaximum(MinMax<?> ob) {
		return maximum() == ob.maximum();
	}

}
