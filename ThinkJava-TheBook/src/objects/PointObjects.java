package objects;

import java.awt.Point;

public class PointObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point blank;
		blank = new Point(3, 4);
		printPoint(blank);
		int x = blank.x;
		System.out.println(x);
		System.out.println(blank);

		Point full = new Point(4, 5);
		System.out.println(distance(blank, full));
	}

	/**
	 * This method takes a point as an argument and displays its attributes in
	 * parentheses. If you invoke printPoint(blank), it displays (3, 4).
	 * 
	 * @param p
	 */
	public static void printPoint(Point p) {
		System.out.println("(" + p.x + ", " + p.y + ")");
	}

	/**
	 * As another example, we can rewrite the distance method from “Writing Methods”
	 * on page 73 so that it takes two Points as parameters instead of four doubles.
	 * 
	 * @param p1
	 * @param p2
	 * @return
	 */
	public static double distance(Point p1, Point p2) {
		int dx = p2.x - p1.x;
		int dy = p2.y - p1.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}
