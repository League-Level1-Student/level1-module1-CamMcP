package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary implements ActionListener {
	JFrame e = new JFrame();
	JPanel E = new JPanel();
	JLabel ee = new JLabel();
	JButton EE = new JButton();
	JTextField eee = new JTextField(20);
	public void run() {
		e.setTitle("Convert Binary");
		EE.setText("Convert");
		EE.addActionListener(this);
		ee.setText("A");
		e.add(E);
		E.add(eee);
		E.add(EE);
		E.add(ee);
		e.pack();
		e.setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) {
	String EEE = eee.getText();
		String answer = convert(EEE);
		ee.setText(answer);
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
}
