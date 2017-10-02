package homework02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProblemA {
	
	public static void problemA() {
		
		String message, placeholder;
		
		Scanner in = new Scanner(System.in);
		
		message = "What area do you need for your enclosure in square feet?";
		placeholder = "Enter a positive number...";
		
		int area;

		area = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		
		while (area < 0 || area > 1000000) {
			JOptionPane.showMessageDialog(null, "Please enter a positive number less than 1,000,000.");
			area = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		}
		
		
		
	}

}
