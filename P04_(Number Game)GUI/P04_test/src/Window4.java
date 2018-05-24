import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window4 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Combined Layout");
		frame.setBounds(50, 50, 300, 300);
		frame.setLayout(new BorderLayout());

		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());

		JLabel label1 = new JLabel("Label A");
		JLabel label2 = new JLabel("Label B");
		JLabel label3 = new JLabel("Label C");

		topPanel.add(label1);
		topPanel.add(label2);
		topPanel.add(label3);
		frame.add(topPanel, BorderLayout.NORTH);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());

		JButton buttonA = new JButton("Button A");
		JButton buttonB = new JButton("Button B");

		bottomPanel.add(buttonA);
		bottomPanel.add(buttonB);
		frame.add(bottomPanel, BorderLayout.SOUTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		JTextField text = new JTextField("Hello");
		centerPanel.add(text);
		frame.add(centerPanel, BorderLayout.CENTER);
		JButton buttonC = new JButton("Button C");
		JButton buttonD = new JButton("Button D");
		frame.add(buttonC, BorderLayout.EAST);
		frame.add(buttonD, BorderLayout.WEST);
		// centerPanel.add(new JTextField("Hello"));

		// frame.add(centerPanel, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// centers the frame on the screen
		frame.setLocationRelativeTo(null);

		frame.getContentPane().setBackground(Color.WHITE);

		//
		frame.pack();
		// shows the frame
		frame.setVisible(true);
	}
}

/*
 * import java.awt.BorderLayout; import java.awt.Button; import java.awt.Color;
 * 
 * import javax.swing.JFrame;
 * 
 * 
 * public class Window4 { public static void main(String args[]) { JFrame p =
 * new JFrame(); p.setLayout(new BorderLayout()); p.add(new Button("Button A"),
 * BorderLayout.NORTH); p.add(new Button("Button B"), BorderLayout.SOUTH);
 * p.add(new Button("Button C"), BorderLayout.EAST); p.add(new
 * Button("Button D"), BorderLayout.WEST); p.add(new Button("Button E"),
 * BorderLayout.CENTER);
 * 
 * p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * 
 * // centers the frame on the screen p.setLocationRelativeTo(null);
 * 
 * p.getContentPane().setBackground(Color.WHITE);
 * 
 * // p.pack(); // shows the frame p.setVisible(true); } }
 */