package frameMain;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class TMAinFrame extends JFrame {
    public TMAinFrame() {
        // Set the size of the frame
        setSize(800, 600);
        
        // Make the frame automatically resizable
        setResizable(true);
        
        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        
        // Create the buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        
        // Add the buttons to the panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        
        // Create a console box (JTextArea)
        JTextArea consoleBox = new JTextArea();
        
        // Make the console box editable (so you can append text to it)
        consoleBox.setEditable(false);
        
        // Create a scroll pane for the console box
        JScrollPane scrollPane = new JScrollPane(consoleBox);
        
        // Set the size of the scroll pane (change as needed)
        scrollPane.setPreferredSize(new Dimension(600, 400));
        
        // Add the scroll pane to the frame (change the location as needed)
        add(scrollPane, BorderLayout.CENTER);
        scrollPane.setLocation(100, 100);
        
        // Add the panel to the bottom of the frame
        add(buttonPanel, BorderLayout.SOUTH);
        
        // Set the close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        // Example usage: append some text to the console box
        consoleBox.append("Hello, world!\n");
    }
    
    public static void main(String[] args) {
        new TMAinFrame();
    }
}
