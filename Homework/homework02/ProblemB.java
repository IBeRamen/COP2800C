package homework02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProblemB {
	
	public static void problemB() {
		
		String message, placeholder;
		
		Scanner in = new Scanner(System.in);
		
		message = "How many knives have you sold this month?";
		placeholder = "Enter knives sold...";
		
		int moneyMade, knivesSold;

		knivesSold = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));

		// Check if knivesSold is negative or greater than 1,000,000
		while (knivesSold < 0 || knivesSold > 1000000) {
			JOptionPane.showMessageDialog(null, "Please enter a positive number less than 1,000,000.");
			knivesSold = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		}

		// If knivesSold is less than or equal to 100 pay $5 per knife sold
		// Else if knivesSold in between 101 and 200 pay $10 per knife sold
		// Else any knife sold above 200 pay $15 per knife sold
		if (knivesSold <= 100) {
			moneyMade = knivesSold * 5;
		}
		else if (knivesSold >= 101 && knivesSold <= 200) {
			moneyMade = 100 * 5 + (knivesSold % 100) * 10;
		}
		else {
			moneyMade = 100 * 5 + 100 * 10 + (200 % knivesSold) * 15;
		}

		JOptionPane.showMessageDialog(null, "You made $" + moneyMade + " selling knives this month.");
		
	}


}
