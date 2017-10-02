package homework02;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		String inputLine, message, prompt;

		char choice;

		do {
			choice = getChoice();

			switch(choice) {
				case 'A':
					ProblemA.problemA();
					break;
				case 'B':
					ProblemB.problemB();
					break;
				case 'C':
					ProblemC.problemC();
					break;
				case 'Q':
					message = "Later!";
					JOptionPane.showMessageDialog(null, message);
					break;
				default:
					message = "Invalid selection... try again.";
					JOptionPane.showMessageDialog(null, message);
					break;
			}
		} while (choice != 'Q');
		
	}
	
	public static char getChoice() {

		char result = ' ';

		String inputLine, message;

		message = "A. Land Enclosure\n" +
				  "B. Pay Calculator\n" +
				  "C. Best Deal\n" +
				  "Q. Quit the program";

		inputLine = JOptionPane.showInputDialog(message, "Enter a selection...");

		inputLine = inputLine.toUpperCase();

		result = inputLine.charAt(0);

		return result;

	}

}