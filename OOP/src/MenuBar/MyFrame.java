package MenuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;

	MyFrame() {
		// TODO Auto-generated constructor stub

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());

		menuBar = new JMenuBar();
		fileMenu = new JMenu("file");
		editMenu = new JMenu("edit");
		helpMenu = new JMenu("help");

		loadItem = new JMenuItem("load");
		saveItem = new JMenuItem("save");
		exitItem = new JMenuItem("exit");

		loadItem.addActionListener(this);
		loadItem.addActionListener(this);
		loadItem.addActionListener(this);

		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == loadItem) {
			System.out.println("BEEP< BEEP, file loaded.");

		}

		if (e.getSource() == saveItem) {
			System.out.println("BEEP< BEEP, file saved.");

		}

		if (e.getSource() == exitItem) {
			System.exit(0);

		}

	}
}
