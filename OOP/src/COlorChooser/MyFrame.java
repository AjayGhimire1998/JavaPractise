package COlorChooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;

	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(getLayout());

		button = new JButton("Pick a color");
		button.addActionListener(this);

		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text");
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label.setOpaque(true);

		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();

			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			label.setForeground(color);
		}

	}

}
