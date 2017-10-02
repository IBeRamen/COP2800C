package homework02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProblemC {
	
	public static void problemC() {
		
		Scanner in = new Scanner(System.in);
		
		String message, placeholder;

		int moneyLeft, item1, item2, item3;
		
		message = "How much money is left on your meal card?";
		placeholder = "Enter an amount in dollars...";

		moneyLeft = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		
		// Check if moneyLeft is negative or greater than 1,000
		while (moneyLeft < 0 || moneyLeft > 1000) {
			JOptionPane.showMessageDialog(null, "Please enter a positive number less than 1,000.");
			moneyLeft = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		}

		JOptionPane.showMessageDialog(null, "What is the cost in dollars of the three items you may buy?");
		item1 = Integer.parseInt(JOptionPane.showInputDialog("Item 1 cost", placeholder));
		item2 = Integer.parseInt(JOptionPane.showInputDialog("Item 2 cost", placeholder));
		item3 = Integer.parseInt(JOptionPane.showInputDialog("Item 3 cost", placeholder));
		
		
		
	}

}
