package cursorsInJava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		for (int i = 0; i <= 10; i++) {
			vector.addElement(i);
		}
		System.out.println(vector);

		Enumeration<Integer> e = vector.elements();
		while (e.hasMoreElements()) {
			int i = e.nextElement();
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
