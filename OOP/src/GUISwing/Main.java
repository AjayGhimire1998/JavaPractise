package GUISwing;

import java.awt.Color;

import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JFrame:a GUI window to add components to;
//		new MyFrame();

		// JLabel = a GUI display area for a string of text, an image, or both;

		JLabel label = new JLabel(); // create a label
		MyFrame myFrame = new MyFrame();

		label.setText("Come on nowww...."); // set texts of label
		myFrame.getContentPane().setBackground(Color.white);
		myFrame.add(label);
	}

}
