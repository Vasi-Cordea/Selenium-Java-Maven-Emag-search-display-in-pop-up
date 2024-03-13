package Emag_automation;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.font.*;
import java.io.*;
import javax.swing.*;
public class Jframe_popup {
	
	
	
	



	
	  public static void main(String[] args) {
	    JFrame frame = new JFrame();
		frame.setLayout(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font1 = new Font("SansSerif", Font.BOLD, 20);
	    
	    JTextField textfield = new JTextField();
		textfield.setLocation(5, 5);
		textfield.setSize(150,20);	
		textfield.setFont(font1);
		textfield.setHorizontalAlignment(JTextField.CENTER);
	    frame.getContentPane().add(textfield);
		
		frame.setSize(350, 60);
	    frame.setVisible(true);

	  }

	}



