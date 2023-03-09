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

}
