import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener {

	JLabel label;
	ImageIcon icon;

	public MyFrame() {
		// TODO Auto-generated constructor stub

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);

		this.addKeyListener(this);

		icon = new ImageIcon("rocket-png-1.png");

		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
//		label.setBackground(Color.RED);
//		label.setOpaque(true);

		Image image = icon.getImage();
		Image newImage = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newImage);
		label.setIcon(icon);
//		this.setBackground(Color.black);

		this.add(label);

		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		switch (e.getKeyChar()) {
		case 'a':
			label.setLocation(label.getX() - 10, label.getY());
			break;
		case 'w':
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		case 's':
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		case 'd':
			label.setLocation(label.getX() + 10, label.getY());
			break;
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		switch (e.getKeyCode()) {
		case 37:
			label.setLocation(label.getX() - 10, label.getY());
			break;
		case 38:
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		case 39:
			label.setLocation(label.getX() + 10, label.getY());
			break;
		case 40:
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		System.out.println("You realeased the key charcter:  " + e.getKeyChar());
		System.out.println("You realeased the key code:  " + e.getKeyCode());

	}

}
