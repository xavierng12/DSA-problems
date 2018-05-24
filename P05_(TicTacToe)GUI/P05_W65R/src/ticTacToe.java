import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.*;

public class ticTacToe {
	public static Sym currentPlayer;

	public static void main(String[] args) {
		final Board tttBoard = new Board();
		final Sym player1Symbol = Sym.X;
		final Sym player2Symbol = Sym.O;
		currentPlayer = player1Symbol;
		// create the frame
		final JFrame frame = new JFrame("Tic Tat Toe Game");
		frame.setBounds(50, 50, 600, 600);
		// set grid layout to the frame
		frame.setLayout(new BorderLayout());

		// create the four panels
		JPanel topPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel bottomPanel = new JPanel();

		topPanel.setBorder(new TitledBorder("Enter Position"));
		centerPanel.setBorder(new TitledBorder("center panel"));
		bottomPanel.setBorder(new TitledBorder("bottom panel"));

		topPanel.setLayout(new GridLayout(2, 2));
		final JTextField txtRow = new JTextField("0", 1);
		final JTextField txtCol = new JTextField("0", 1);
		JButton buttonEnter = new JButton("Enter");
		JButton buttonReset = new JButton("Reset");
		txtRow.setBackground(Color.YELLOW);
		txtCol.setBackground(Color.YELLOW);
		JLabel row = new JLabel("Row");
		JLabel col = new JLabel("Col");
		topPanel.add(row);
		topPanel.add(col);

		JPanel rowPanel = new JPanel();
		rowPanel.add(row);
		rowPanel.add(txtRow);

		JPanel colPanel = new JPanel();
		colPanel.add(col);
		colPanel.add(txtCol);

		topPanel.add(rowPanel);
		topPanel.add(colPanel);
		topPanel.add(buttonEnter);
		topPanel.add(buttonReset);

		centerPanel.setLayout(new FlowLayout());
		final JTable table = new JTable(3, 3);
		table.setEnabled(false);
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				table.setValueAt(tttBoard.tboard[i][j], i, j);
			}
		}

		centerPanel.add(table, BorderLayout.CENTER);

		centerPanel.setSize(200, 300);

		bottomPanel.setLayout(new FlowLayout());
		final JLabel labelGame = new JLabel("Start New Game");
		bottomPanel.add(labelGame, BorderLayout.SOUTH);
		Font Font1 = new Font("SanSerif", Font.BOLD, 30);
		labelGame.setFont(Font1);
		labelGame.setForeground(Color.RED);
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(bottomPanel, BorderLayout.SOUTH);

		buttonEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = Integer.valueOf(txtRow.getText());
				int c = Integer.valueOf(txtCol.getText());
				tttBoard.getTboard()[r][c] = currentPlayer;
				table.setValueAt(tttBoard.tboard[r][c], r, c);
				if (tttBoard.getTboard()[r][c] != Sym.E) {
					labelGame.setText("The value is not empty");
				} else {
					tttBoard.getTboard()[r][c] = currentPlayer;
					table.setValueAt(tttBoard.tboard[r][c], r, c);

					if (tttBoard.checkWinner(currentPlayer) == true) {
						labelGame.setText("The winner is " + currentPlayer);

					} else {
						/* � The players must take turns to choose the option. */
						if (currentPlayer == player1Symbol) {
							currentPlayer = player2Symbol;
//							labelGame.setText("Player" + currentPlayer
//									+ "'s turn");
//
//							currentPlayer = player2Symbol;
//							labelGame.setText("Player" + currentPlayer
//									+ "'s turn");
						} else {
							currentPlayer = player1Symbol;
							labelGame.setText("Player" + currentPlayer
									+ "'s turn");
						}
					}
				}
			}
		});

		buttonReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Board tttBoard = new Board();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						table.setValueAt("E", i, j);
					}
				}
			}
		});

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
