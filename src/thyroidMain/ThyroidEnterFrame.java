package thyroidMain;

import java.awt.*;	
import java.awt.event.*;
import javax.swing.*;

class ThyroidEnterFrame extends JFrame {
	private JTextField textField1;

	ThyroidEnterFrame()	{
		// Creating Object of Jpanel class
		JPanel pa = new JPanel();
		// set the layout
		pa.setLayout(new BorderLayout());
		// add a new JButton with name "wel" and it is
		pa.add(new JButton("WelCome"), BorderLayout.NORTH);
		// add a new JButton with name "come" and it is

		// Add the buttons to the panel
			 JPanel buttonPanel = new JPanel();
			 String[] buttonArray = {"apple", "banana", "cherry", "date"};
			 for (int i = 0; i < buttonArray.length; i++) {
			     JButton button = tsub_MakeButtons.createButton(buttonArray[i]);
			     buttonPanel.add(button); // add the button to the panel
			 }
			 pa.add(buttonPanel, BorderLayout.SOUTH);
//		pa.add(new JButton("Button1"), BorderLayout.SOUTH);

		pa.add(new JButton("Layout"), BorderLayout.EAST);
		pa.add(new JButton("Border"), BorderLayout.WEST);
		// add a new JButton with name "hello everybody" and it is
			textField1 = new JTextField(20);
			JPanel textFieldPanel = new JPanel();
			textFieldPanel.add(textField1);
			pa.add(textFieldPanel, BorderLayout.CENTER);
		
		// add the pa object which refer to the Jpanel
		add(pa);
		// Function to close the operation of JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}
	public static void main(String[] args)	{
		// calling the constructor
		new ThyroidEnterFrame();
	}
}
