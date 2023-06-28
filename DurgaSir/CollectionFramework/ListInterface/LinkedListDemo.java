package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add("Ajay");
		list.add(30);
		list.add("Ajay");
		System.out.println(list);
		list.set(1, 24);
		System.out.println(list);
		list.add(0, "Ghimire");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Ghimireuyyuu");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(3));
	}
}
