package thyroidMain;

import java.awt.*;	
import java.awt.event.*;
import javax.swing.*;

class ThyroidEnterFrame extends JFrame {
	ThyroidEnterFrame()	{
		JPanel pa = new JPanel();
		pa.setLayout(new BorderLayout());
		// add a new JButton with name "wel" and it is
		pa.add(new JButton("WelCome"), BorderLayout.NORTH);
		pa.add(new JButton("Layout"), BorderLayout.EAST);
		pa.add(new JButton("Border"), BorderLayout.WEST);
		
		// Add the buttons to the panel
			JPanel buttonPanel = new JPanel();
			String[] buttonArray = {"apple", "banana", "cherry", "date"};
			for (int i = 0; i < buttonArray.length; i++) {
			     JButton button = tsub_MakeButtons.createButton(buttonArray[i]);
			     buttonPanel.add(button); // add the button to the panel
			}

			JPanel textFieldPanel = new JPanel();
			JTextField textField = tsub_MakeButtons.createTextField();
			textFieldPanel.add(textField);
			
		pa.add(buttonPanel, BorderLayout.SOUTH);
		pa.add(textFieldPanel, BorderLayout.SOUTH);
		
		add(buttonPanel, BorderLayout.SOUTH);
//		add(textFieldPanel, BorderLayout.SOUTH);
		add(pa);

		// Function to close the operation of JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1600, 600);
		setVisible(true);
	}
	public static void main(String[] args)	{
		// calling the constructor
		new ThyroidEnterFrame();
	}
}
