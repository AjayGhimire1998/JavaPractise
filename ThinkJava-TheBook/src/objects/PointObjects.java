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

	public static void printPoint(Point p) {
		System.out.println("(" + p.x + ", " + p.y + ")");
	}

}
