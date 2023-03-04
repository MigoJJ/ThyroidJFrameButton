package thyroidMain;

import java.awt.*;
import javax.swing.*;

class ThyroidEnterFrame extends JFrame {
    ThyroidEnterFrame() {
        // Create a JPanel for the main content area
        JPanel pa = new JPanel();
	        pa.setLayout(new BorderLayout());
	        pa.add(new JButton("Layout"), BorderLayout.EAST);

        JButton buttonW = new JButton("Border");
	        buttonW.setPreferredSize(new Dimension(300, buttonW.getPreferredSize().height));
	        pa.add(buttonW, BorderLayout.WEST);

        // Create a panel containing the returned list with proper indentation
        JPanel returnedPanel = ThyroidReturnList.thyroidReturnList("Symptome");
	        Font newFont = new Font("Arial", Font.PLAIN, 16);
	        returnedPanel.setFont(newFont);
	        Component[] components = returnedPanel.getComponents();
		        for (Component c : components) {
		            c.setFont(newFont);
		        }
        JPanel centerPanel = new JPanel(new GridLayout(1, 1));
    		JPanel indentedPanel = new JPanel(new BorderLayout());
		        indentedPanel.add(returnedPanel, BorderLayout.CENTER);
		        indentedPanel.setBorder(BorderFactory.createEmptyBorder(40, 140, 0, 0));
		        centerPanel.add(indentedPanel);
	        pa.add(centerPanel, BorderLayout.CENTER);

        // Create a panel containing the top buttons
        JPanel buttonPaneltop = new JPanel();
	        String[] buttonArraytop = {"top apple", "top banana", "top cherry", "top date"};
		        for (int i = 0; i < buttonArraytop.length; i++) {
		            JButton buttontop = tsub_MakeButtons.createButton(buttonArraytop[i]);
		            buttonPaneltop.add(buttontop);
		        }

        // Create a panel containing the bottom buttons
        JPanel buttonPanel = new JPanel();
	        String[] buttonArray = {"apple", "banana", "cherry", "date"};
		        for (int i = 0; i < buttonArray.length; i++) {
		            JButton button = tsub_MakeButtons.createButton(buttonArray[i]);
		            buttonPanel.add(button);
		        }

        // Create a panel containing the text field
        JPanel textFieldPanel = new JPanel();
	        JTextField textField = tsub_MakeButtons.createTextField();
	        textFieldPanel.add(textField);

        // Add the top and bottom button panels and the text field panel to the main content panel
        pa.add(buttonPaneltop, BorderLayout.NORTH);
        JPanel southPanel = new JPanel(new FlowLayout()); // or new GridLayout(rows, columns)
			southPanel.add(buttonPanel);
			southPanel.add(textFieldPanel);
			pa.add(southPanel, BorderLayout.SOUTH);

        // Add the main content panel to the JFrame
        add(pa);

        // Set the size and location of the JFrame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        setSize(width/2, height/2);
        setLocationRelativeTo(null);
        setSize(1600, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // calling the constructor
        new ThyroidEnterFrame();
    }
}
