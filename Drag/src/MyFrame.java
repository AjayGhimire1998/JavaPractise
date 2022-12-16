import javax.swing.JFrame;

public class MyFrame extends JFrame {

	DragPanel dragPanel = new DragPanel();

	public MyFrame() {
		// TODO Auto-generated constructor stub

		this.add(dragPanel);
		this.setTitle("Drag & Grop Demo");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}
