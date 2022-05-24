/*Programmer: Seth Prevott 
Date: 04/16/2022
Lab 13
Instructor: Dr. Rafael Azuaje
College: San Antonio College*/

import javax.swing.JFrame;
import javax.swing.JLabel;
public class JBookQuote {

	public static void main(String[] args) {
		final int APPLICATION_WIDTH=350;
		final int APPLICATION_HEIGHT=100;
		
		JFrame newframe=new JFrame();
		newframe.setTitle("Quote from the movie 'Jaws'");
		newframe.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
		
		String quote = "We're gonna need a bigger boat. - Brody";
		JLabel quotelabel = new JLabel(quote);
		newframe.add(quotelabel);
		newframe.setVisible(true);
		newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
