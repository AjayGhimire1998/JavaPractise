package objects;

import java.awt.Rectangle;

public class MutableObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(0, 0, 100, 200);
		box.x = box.x + 50;
		box.y = box.y + 100;
		System.out.println(box);
		moveRect(box, 20, 30);
		System.out.println(box);

		// or

		box.translate(10, 10);
		System.out.println(box);

	}

	/**
	 * The variables dx and dy indicate how far to move the rectangle in each
	 * direction. Invoking this method has the effect of modifying the Rectangle
	 * that is passed as an argument.
	 * 
	 * @param rect
	 * @param dx
	 * @param dy
	 */
	public static void moveRect(Rectangle rect, int dx, int dy) {
		rect.x = rect.x + dx;
		rect.y = rect.y + dy;
	}

}
