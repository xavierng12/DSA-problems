import java.awt.*;
import javax.swing.*;
public class Windows1 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("TextField");
		frame.setBounds(50,50,600,600);
		frame.setLayout(new FlowLayout());
		JTextField txtRow = new JTextField(10);
		JTextField txtColumn = new JTextField("Column");
		JTextField txtValue = new JTextField("Value",30);
		
		frame.add(txtRow);
		frame.add(txtColumn);
		frame.add(txtValue);
		txtRow.setBackground(Color.YELLOW);
		frame.setVisible(true);
	}
}
