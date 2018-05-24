import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class problemSolution04 {

	public static int secret;

	public static void main(String args[]) {
		JFrame frame = new JFrame("Number Guessing Game");
		frame.setBounds(50, 50, 300, 300);
		frame.setLayout(new BorderLayout());

		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());

		JLabel label1 = new JLabel("Guess a number between 1 to 49");
		label1.setForeground(Color.BLUE);
		Font Font1 = new Font("SanSerif", Font.BOLD, 30);
		label1.setFont(Font1);
		topPanel.add(label1);
		frame.add(topPanel, BorderLayout.NORTH);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());
		JButton buttonA = new JButton("Generate Number");
		final JTextField text = new JTextField(10);
		JButton buttonB = new JButton("Guess");

		bottomPanel.add(buttonA);
		bottomPanel.add(text);
		frame.add(bottomPanel/* ,BorderLayout.CENTER */);
		bottomPanel.add(buttonB);
		frame.add(bottomPanel, BorderLayout.SOUTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		JLabel label2 = new JLabel("Start Guessing!");
		label2.setForeground(Color.RED);
		Font Font2 = new Font("SanSerif", Font.BOLD, 50);
		label2.setFont(Font2);
		centerPanel.setBackground(Color.YELLOW);
		centerPanel.add(label2);
		frame.add(centerPanel, BorderLayout.CENTER);

		buttonA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				secret = new java.util.Random().nextInt(49);
				JOptionPane.showMessageDialog(null, secret);
			}
		});

		buttonB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int max = 49;
				int min = 0;
				int guessnumber = Integer.valueOf(text.getText());
				try {

					if (Integer.valueOf(text.getText()) == secret) {
						JOptionPane.showMessageDialog(null,
								"You guessed it correctly!");
					}
					if (Integer.valueOf(text.getText()) > secret) {
						JOptionPane.showMessageDialog(null, "Too high! " + "The number is between " + (guessnumber-1) + " and " + min );
					}
					if (Integer.valueOf(text.getText()) < secret) {
						JOptionPane.showMessageDialog(null, "Too low!" + " The number is between" + (guessnumber+1)+ " and " + max);
					}

					if (Integer.valueOf(text.getText()) >= 50) {
						JOptionPane.showMessageDialog(null, "Out of range!");
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error!");
				}
			}

		});

		// int data = Integer.parseInt(text.getText());//

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// centers the frame on the screen
		frame.setLocationRelativeTo(null);

		frame.getContentPane().setBackground(Color.YELLOW);

		//
		frame.pack();
		// shows the frame
		frame.setVisible(true);
	}
}
