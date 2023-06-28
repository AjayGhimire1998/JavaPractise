package cursorsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {

		// on arrayList
		List<String> list = new ArrayList<>();
		list.add("Ajay");
		list.add("Ghimire");
		list.add("Dharan");
		System.out.println(list);

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String elem = itr.next();
			System.out.println(elem);

			// remove Dharan

			if (elem.equals("Dharan")) {
				itr.remove();
			}
		}

		System.out.println(list);

		// on linked list

		List<Integer> list2 = new LinkedList<>();
		int i = 1;
		while (i <= 10) {
			list2.add(i);
			i++;
		}

		System.out.println(list2);

		Iterator<Integer> itr2 = list2.iterator();

		while (itr2.hasNext()) {
			int elem = itr2.next();

			if (elem % 2 == 0) {
				System.out.println(elem);
			} else {
				itr2.remove();
			}

		}

		System.out.println(list2);

	}
}
