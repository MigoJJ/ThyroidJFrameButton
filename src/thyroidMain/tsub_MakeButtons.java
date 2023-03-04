package thyroidMain;

import javax.swing.JButton;

public class tsub_MakeButtons {
    
	public static JButton createButton(String label) {
        // Create the button
        JButton button = new JButton(label);
        
        // Set the size and location of the button (change as needed)
        button.setBounds(100, 50, 100, 30);
        
        return button;
    }
}
