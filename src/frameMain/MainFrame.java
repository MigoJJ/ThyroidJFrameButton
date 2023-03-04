package frameMain;

//Java program to illustrate the BorderLayout
import java.awt.*;	
import java.awt.event.*;
import javax.swing.*;

//class extends JFrame
class MainFrame extends JFrame {
	  private JTextField textField1;

	MainFrame()
	{
		
		// Creating Object of Jpanel class
		JPanel pa = new JPanel();

		// set the layout
		pa.setLayout(new BorderLayout());

		// add a new JButton with name "wel" and it is
		// lie top of the container
		pa.add(new JButton("WelCome"), BorderLayout.NORTH);

		// add a new JButton with name "come" and it is
		// lie button of the container
      
        // Add the buttons to the panel
		 pa.add(new JButton("button1"), BorderLayout.SOUTH);
        
		 JPanel buttonPanel = new JPanel();
        // Create the buttons
 
		 JButton button = MakeButtons.createButton("Button 12312341");
		 
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        // Add the buttons to the panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button);
        // Add the panel to the bottom of the frame
        add(buttonPanel, BorderLayout.SOUTH);
		
		// add a new JButton with name "Layout" and it is
		// lie left of the container
		pa.add(new JButton("Layout"), BorderLayout.EAST);

		// add a new JButton with name "Border" and it is
		// lie right of the container
		pa.add(new JButton("Border"), BorderLayout.WEST);

		// add a new JButton with name "hello everybody" and it is
		// lie center of the container
        textField1 = new JTextField(20);
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.add(textField1);
        pa.add(textFieldPanel, BorderLayout.CENTER);
		
		// add the pa object which refer to the Jpanel
		add(pa);

		// Function to close the operation of JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Function to set size of JFrame.
		setSize(600, 600);

		// Function to set visible status of JFrame.
		setVisible(true);
	}

	// Driver code
	public static void main(String[] args)	{
		// calling the constructor
		new MainFrame();
	}

}
