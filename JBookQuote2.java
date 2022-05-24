/*Programmer: Seth Prevott 
Date: 04/16/2022
Lab 13
Instructor: Dr. Rafael Azuaje
College: San Antonio College*/

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JBookQuote2 extends JFrame implements ActionListener {
	final int APPLICATION_WIDTH=350;
	final int APPLICATION_HEIGHT=100;
	String Quote="Never gonna give you up. - Rick Astley";
	JButton btnDisplay = new JButton("Display Song Quote");
	JLabel quoteLabel = new JLabel();
	
public JBookQuote2() {
	setTitle("Song Quote");
	setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	setLayout(new FlowLayout());
	add(btnDisplay);
	add(quoteLabel);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	btnDisplay.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
	quoteLabel.setText(Quote);
}
public static void main(String[] args) {
	JBookQuote2 newframe= new JBookQuote2();
	newframe.setVisible(true);
}
}