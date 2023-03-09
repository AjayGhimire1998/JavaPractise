package objects;

import java.awt.Point;

public class GarbageCollection {

	public static void main(String[] args) {
		/*
		 * The first line creates a new Point object and makes blank refer to it. The
		 * second line changes blank so that instead of referring to the object, it
		 * refers to nothing.
		 */
		Point blank = new Point(3, 5);
		System.out.println(blank);

		/*
		 * If there are no references to an object, there is no way to access its
		 * attributes or invoke a method on it. From the programmer’s view, it ceases to
		 * exist. However it’s still present in the computer’s memory, taking up space.
		 */
		blank = null;
		System.out.println(blank);

		/*
		 * As your program runs, the system automatically looks for stranded objects and
		 * reclaims them; then the space can be reused for new objects. This process is
		 * called garbage collection.
		 */

		/*
		 * You don’t have to do anything to make garbage collection happen, and in
		 * general don’t have to be aware of it. But in high-performance applications,
		 * you may notice a slight delay every now and then when Java reclaims space
		 * from discarded objects.
		 */
	}

}
