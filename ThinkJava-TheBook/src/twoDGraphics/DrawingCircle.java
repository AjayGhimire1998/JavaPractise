package twoDGraphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawingCircle extends Canvas {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Drawing");
		Canvas canvas = new DrawingCircle();
		canvas.setSize(400, 400);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);

	}

	public void paint(Graphics g) {
		g.fillOval(100, 100, 200, 200);
		g.setColor(Color.RED);
	}

}
