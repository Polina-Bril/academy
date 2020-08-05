package by.academy.lesson12;

import java.util.Set;
import java.util.TreeSet;

public class HeavyBoxDemo {

	public static void main(String[] args) {
		HeavyBox box1 = new HeavyBox(5, 7, 3, 15);
		HeavyBox box2 = new HeavyBox(8, 11, 13, 5);
		HeavyBox box3 = new HeavyBox(1, 12, 15, 25);
		HeavyBox box4 = new HeavyBox(10, 11, 13, 5);
		HeavyBox box5 = new HeavyBox(4, 11, 13, 5);

		Set<HeavyBox> treeSet = new TreeSet<HeavyBox>();
		treeSet.add(box1);
		treeSet.add(box2);
		treeSet.add(box3);
		treeSet.add(box4);
		treeSet.add(box5);

		int i=1;
		for (HeavyBox box : treeSet) {
			System.out.println("Box "+i++ + " " + box.width + " " + box.height + " " + box.depth+" "+box.weight);
		}

	
	}
	

}
