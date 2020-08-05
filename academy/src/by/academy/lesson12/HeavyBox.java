package by.academy.lesson12;

public class HeavyBox extends Box implements Comparable {
	int weight;

	public HeavyBox(int w, int h, int d, int m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	@Override
	public int compareTo(Object o) {
		HeavyBox box = (HeavyBox) o;
		if (this.width < box.width) {
			return -1;
		} else if (this.width > box.width) {
			return 1;
		}
		return 0;
	}

}