package polygonInterfaceApp;

import java.util.Scanner;

public class PolygonApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Polygon p = null;
		String type;

		do {
			System.out.print("Enter polygon type (triangle, quadrilateral, pentagon, hexagon, octagon): ");
			type = in.nextLine();
		} while (!type.equals("triangle") && !type.equals("quadrilateral") && !type.equals("pentagon")
				&& !type.equals("hexagon"));
	}
}
