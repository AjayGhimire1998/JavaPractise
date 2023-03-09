package objects;

import java.awt.Rectangle;

public class Aliasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box1 = new Rectangle(0, 0, 200, 100);
		Rectangle box2 = box1;
		System.out.println(box2.width);
		box1.grow(50, 50);

		/*
		 * When we make a change using box1, we see the change using box2. Thus, the
		 * value displayed by the third line is 200, the width of the expanded
		 * rectangle.
		 */
		System.out.println(box2.width);
		System.out.println(box1);
		System.out.println(box2);
	}

}
