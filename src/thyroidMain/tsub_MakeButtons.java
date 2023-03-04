package thyroidMain;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tsub_MakeButtons extends ThyroidEnterFrame {
    
	public static JButton createButton(String label) {
        JButton button = new JButton(label);
        	button.setBounds(100, 50, 100, 30);
        return button;
	}
	
	public static JTextField createTextField() {
		JTextField textField = new JTextField("Enter text here....");
			Font font = new Font("Arial", Font.PLAIN, 18); // create a new font object with size 18
			textField.setFont(font);
			textField.setColumns(40); // set the preferred number of columns to 20
			textField.setBounds(50, 50, 200, 130);
			textField.setVisible(true);
//			textField.setHorizontalAlignment(JTextField.SOUTH);

		return textField;
    }
}
