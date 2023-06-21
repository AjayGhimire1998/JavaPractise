package ListInterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

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

//		ArrayList list2 = new ArrayList(1000);
//
//		for (int i = 0; i < list2.size() - 1; i++) {
//			list2.add(null);
//		}
//		System.out.println(list2.get(0));

		// checking instances of collections
		LinkedList list2 = new LinkedList<>();
		System.out.println(list instanceof Serializable);
		System.out.println(list instanceof Cloneable);
		System.out.println(list instanceof RandomAccess);
		System.out.println(list2 instanceof Serializable);
		System.out.println(list2 instanceof Cloneable);
		System.out.println(list2 instanceof RandomAccess);

		List list3 = Collections.synchronizedList(list);

		System.out.println(list3);
//		list3.iterator();
	}
}
