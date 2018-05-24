//import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class WindowTable {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Window Table");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFrame f = new JFrame("JTable");

		JTable table = new JTable(4, 3);

		table.setEnabled(false);

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3; j++) {

				table.setValueAt("*", i, j);

			}
		}

		f.add(table, BorderLayout.CENTER);

		f.setSize(200, 300);
		f.setVisible(true);

	}
}
