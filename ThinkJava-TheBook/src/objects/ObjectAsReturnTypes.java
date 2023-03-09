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

	public static Point findCenter(Rectangle rect) {
		int x = rect.x + rect.width / 2;
		int y = rect.y + rect.height / 2;
		return new Point(x, y);
	}

}
