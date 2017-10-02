package homework02;

import javax.swing.JOptionPane;

public class ProblemC {
	
	public static void problemC() {
		
		String message, placeholder;

		int item1, item2, item3, balance, moneyLeft = 0;
		
		message = "How much money is left on your meal card?";
		placeholder = "Enter an amount...";

		balance = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		
		// Check if moneyLeft is negative or greater than 1,000
		while (balance < 0 || balance > 1000) {
			JOptionPane.showMessageDialog(null, "Please enter a positive number less than 1,000.");
			balance = Integer.parseInt(JOptionPane.showInputDialog(message, placeholder));
		}

		JOptionPane.showMessageDialog(null, "What is the cost in dollars of the three items you may buy?");
		item1 = Integer.parseInt(JOptionPane.showInputDialog("Item 1 cost", placeholder));
		item2 = Integer.parseInt(JOptionPane.showInputDialog("Item 2 cost", placeholder));
		item3 = Integer.parseInt(JOptionPane.showInputDialog("Item 3 cost", placeholder));
		
		if (item1 <= item3 && item2 <= item3) {
			moneyLeft = balance - (item1 + item2);
		}
		if (item3 <= item2 && item1 <= item2) {
			moneyLeft = balance - (item3 + item1);
		}
		if (item2 <= item1 && item3 <= item1) {
			moneyLeft = balance - (item3 + item2);
		}
		
		JOptionPane.showMessageDialog(null, "The least amount of money you can leave on your card is $" + moneyLeft);
		
	}

}
