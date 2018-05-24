import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.*;


public class LayoutGrid {
	public static void main(String[]args){
		//create the frame
		JFrame frame = new JFrame("Grid Layout");
		frame.setBounds(50, 50, 600, 600);
		// set grid layout to the frame
		frame.setLayout(new GridLayout(2,2));
		
		//create the four panels
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JPanel panelC = new JPanel();
		JPanel panelD = new JPanel();
		
		panelA.setBorder(new TitledBorder("Panel A"));
		panelB.setBorder(new TitledBorder("Panel B"));
		panelC.setBorder(new TitledBorder("Panel C"));
		panelD.setBorder(new TitledBorder("Panel D"));
		
		frame.add(panelA);
		frame.add(panelB);
		frame.add(panelC);
		frame.add(panelD);
		
		panelA.setLayout(new BorderLayout());
		JButton buttonA1 = new JButton("Button A1");
		JButton buttonA2 = new JButton("Button A2");
		JButton buttonA3 = new JButton("Button A3");
		
		panelA.add(buttonA1,BorderLayout.NORTH);
		panelA.add(buttonA2,BorderLayout.CENTER);
		panelA.add(buttonA3,BorderLayout.SOUTH);
		
		panelB.setLayout(new FlowLayout());
		JButton buttonB1 = new JButton("Button B1");
		JButton buttonB2 = new JButton("Button B2");
		JButton buttonB3 = new JButton("Button B3");
		
		panelB.add(buttonB1);
		panelB.add(buttonB2);
		panelB.add(buttonB3);
		
		panelC.setLayout(new BorderLayout());
		JButton buttonC1 = new JButton("Button C1");
		JButton buttonC2 = new JButton("Button C2");
		JButton buttonC3 = new JButton("Button C3");
		
		panelC.add(buttonC1,BorderLayout.EAST);
		panelC.add(buttonC2,BorderLayout.CENTER);
		panelC.add(buttonC3,BorderLayout.WEST);
		
		panelD.setLayout(new GridLayout(2,2));
		JButton buttonD1 = new JButton("Button D1");
		JButton buttonD2 = new JButton("Button D2");
		JButton buttonD3 = new JButton("Button D3");
		panelD.add(buttonD1);
		panelD.add(buttonD2);
		panelD.add(buttonD3);
		
		frame.setVisible(true);
	}
}
