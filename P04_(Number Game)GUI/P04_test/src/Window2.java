import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.FlowLayout;

public class Window2 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Window 1"); // class
		// sets the x,y,width and height of the frame.
		frame.setBounds(50, 50, 200, 200);

		// create a button (class)
		JButton button = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");

		frame.add(button);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);

		frame.setLayout(new FlowLayout(FlowLayout.TRAILING));

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