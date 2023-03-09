package objects;

import java.awt.Point;

public class NullKeyword {

	public static void main(String[] args) {
		/*
		 * When you create an object variable, remember that you are storing a reference
		 * to an object. In Java, the keyword null is a special value that means “no
		 * object”.
		 */
		Point blank = null;
		System.out.println(blank);
		/*
		 * If you try to use a null value, either by accessing an attribute or invoking
		 * a method, Java throws a NullPointerException.
		 */
		System.out.println(blank.x);

		/*
		 * On the other hand, it is legal to pass a null reference as an argument or
		 * receive one as a return value. For example, null is often used to represent a
		 * special condition or indicate an error.
		 */
	}

}
