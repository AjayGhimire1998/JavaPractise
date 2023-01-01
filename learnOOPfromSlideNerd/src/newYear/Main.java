package newYear;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> createAndShowGUI());
	}

	private static void createAndShowGUI() {
		String[] animationFrames = { "Happy New Year 2023", "Happy New Year 2023.", "Happy New Year 2023..",
				"Happy New Year 2023..." };

		JFrame frame = new JFrame("New Year Animation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		JLabel label = new JLabel(animationFrames[0]);
		frame.add(label);

		Timer timer = new Timer(250, new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(animationFrames[i]);
				i = (i + 1) % animationFrames.length;
			}
		});
		timer.start();

		frame.pack();
		frame.setVisible(true);
	}
}
