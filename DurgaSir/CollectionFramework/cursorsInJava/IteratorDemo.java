package cursorsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
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

	}
}
