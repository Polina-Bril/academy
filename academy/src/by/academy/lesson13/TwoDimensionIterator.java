package by.academy.lesson13;

import java.util.Iterator;

public class TwoDimensionIterator<T> implements Iterator<T> {

	private T[][] array;
	private Integer verticalIndex = 0;
	private Integer horizontalIndex = 0;

	public TwoDimensionIterator(T[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return array != null && (verticalIndex < array.length || horizontalIndex < array[verticalIndex].length)
				&& array[verticalIndex][horizontalIndex] != null;
	}

	@Override
	public T next() {
		if (horizontalIndex < array[verticalIndex].length - 1) {
			horizontalIndex++;
			return array[verticalIndex][horizontalIndex - 1];
		} else {
			verticalIndex++;
			horizontalIndex = 0;
			return array[verticalIndex - 1][array[verticalIndex - 1].length - 1];
		}
	}
}