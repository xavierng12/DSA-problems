import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window1 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Window 1"); // class
		// sets the x,y,width and height of the frame.
		frame.setBounds(50, 50, 200, 200);

		// create a label, textfield and button (class)
		JLabel label = new JLabel("Name:");
		final JTextField textField = new JTextField(10);
		JButton button = new JButton("Hello");

		frame.add(label);
		frame.add(textField);
		frame.add(button);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "Hi " + textField.getText();
				JOptionPane.showMessageDialog(null, data);
			}
		});

		frame.setLayout(new FlowLayout(FlowLayout.TRAILING));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// centers the frame on the screen
		frame.setLocationRelativeTo(null);

		frame.getContentPane().setBackground(Color.GREEN);

		//
		frame.pack();
		// shows the frame
		frame.setVisible(true);
	}

}