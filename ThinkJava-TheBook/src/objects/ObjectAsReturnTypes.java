package objects;

import java.awt.Point;
import java.awt.Rectangle;

public class ObjectAsReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(0, 0, 100, 200);
		System.out.println(box);
		System.out.println(findCenter(box));
	}

	/**
	 * You can write methods that return objects. For example, findCenter takes a
	 * Rectangle as an argument and returns a Point with the coordinates of the
	 * center of the rectangle:
	 * 
	 * The return type of this method is Point. The last line creates a new Point
	 * object and returns a reference to it.
	 * 
	 * @param rect
	 * @return
	 */
	public static Point findCenter(Rectangle rect) {
		int x = rect.x + rect.width / 2;
		int y = rect.y + rect.height / 2;
		return new Point(x, y);
	}

}
