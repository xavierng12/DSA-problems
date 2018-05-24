import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;

public class Window3 {
	public static void main(String args[]) {
		JFrame p = new JFrame("Window 1");
		p.setLayout(new BorderLayout());
		p.add(new Button("Button A"), BorderLayout.NORTH);
		p.add(new Button("Button B"), BorderLayout.CENTER);
		p.add(new Button("Button C"), BorderLayout.SOUTH);
		// p.add(new Button("Button D"), BorderLayout.WEST);
		// p.add(new Button("Button E"), BorderLayout.CENTER);

		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// centers the frame on the screen
		p.setLocationRelativeTo(null);

		p.getContentPane().setBackground(Color.WHITE);

		p.pack();
		// shows the frame
		p.setVisible(true);
	}
}