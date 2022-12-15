package GUISwing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {

		JFrame frame = new JFrame(); // creates a this
		this.setSize(420, 420); // sets x and y dimension of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exists out of the application
		this.setResizable(false); // prevent this from being resized
		this.setTitle("JFRAME title goes here"); // sets title of this
		this.setVisible(true); // make this visible

		ImageIcon icon = new ImageIcon("IMG_3673.jpeg"); // create an image icon

		this.setIconImage(icon.getImage()); // change icon of the this
//		this.getContentPane().setBackground(Color.red);
		this.getContentPane().setBackground(new Color(0, 255, 255)); // change background color of the this
	}

}
