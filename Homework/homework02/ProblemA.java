package homework02;

import javax.swing.JOptionPane;

public class ProblemA {
	
	public static void problemA() {
		
		String message, placeholder;
		
		message = "What area do you need for your enclosure in square feet?";
		placeholder = "Input...";
		
		int area, length, width;

		area = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		
		// Check if area is negative or greater than 1,000,000
		while (area < 0 || area > 1000000) {
			JOptionPane.showMessageDialog(null, "Please enter a positive number less than 1,000,000.");
			area = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		}
		
		length = Integer.parseInt(JOptionPane.showInputDialog("What is the ratio of the length of your enclosure?", placeholder));

		width = Integer.parseInt(JOptionPane.showInputDialog("What is the ratio of the width of your enclosure?", placeholder));
		
		float scale = (float)Math.sqrt(area / (length * width));
		
		float fenceNeeded = 2 * ((float)length * scale) + 2 * ((float)width * scale);
		
		JOptionPane.showMessageDialog(null, "Your enclosure has dimensions " + (float)length * scale + " feet by " + (float)width * scale + " feet."
				+ " You will need " + fenceNeeded + " feet of fence total");
		
	}

}
