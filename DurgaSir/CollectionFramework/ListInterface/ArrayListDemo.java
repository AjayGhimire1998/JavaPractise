package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(1);
		list.add("sup");
		list.add(9f);
		list.add('a');
//		System.out.println(list);
		list.remove(0);
//		System.out.println(list);

//		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

		ArrayList list2 = new ArrayList(list);
		System.out.println(list2);
	}
}
