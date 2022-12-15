package GUISwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	JButton button;

	MyFrame() {

		JButton button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(e -> System.out.println("Button Clicked!!"));
		button.setText("IDK button");

//		JFrame frame = new JFrame(); // creates a this
		this.setSize(500, 500); // sets x and y dimension of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exists out of the application
//		this.setResizable(false); // prevent this from being resized
		this.setTitle("JFRAME title goes here"); // sets title of this
//		

//		ImageIcon icon = new ImageIcon("IMG_3673.jpeg"); // create an image icon

//		this.setIconImage(icon.getImage()); // change icon of the this
//		this.getContentPane().setBackground(Color.red);
//		this.getContentPane().setBackground(new Color(0, 255, 255)); // change background color of the this
		this.add(button);
		this.setVisible(true); // make this visible

	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == button) {
//			System.out.println("Button Clicked!!!");
//		}

//	}

}
