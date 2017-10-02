package classwork05;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String inputLine, message, prompt;

		/**
		 * Ask for input through console
		 */

		/**
		Scanner in = new Scanner(System.in);

		System.out.println("Hey, enter your name: ");
		inputLine = in.nextLine();
		**/

		/**||
		 * Dialog to enter your name and pops up with your name.
		 */

		/**
		message = "What is your name? ";
		prompt = "Enter your name...";
		inputLine = JOptionPane.showInputDialog(message, prompt);

		message = "Hello " + inputLine;
		JOptionPane.showMessageDialog(null, message);
		**/

		/**
		 * Menu system
		 */
		/**
		message = "E. Even or odd\n" +
				  "R. Randomly fill an array\n" +
				  "Q. Quit the program";

		prompt = "Enter your selection...";

		inputLine = JOptionPane.showInputDialog(message, prompt);
		**/

		/**
		 * Modify the input with math
		 */

		/**
		message = "How old are you? ";
		prompt = "Enter your age...";
		double age;

		inputLine = JOptionPane.showInputDialog(message, prompt);

		age = Double.parseDouble(inputLine);

		message = "In 15 years you will be " + (age + 15);

		JOptionPane.showMessageDialog(null, message);
		**/

		char choice;

		do {
			choice = getChoice();

			switch(choice) {
				case 'E':
					break;
				case 'R':

					int arrSize = 50;
					final int LB = -5;
					final int UB = 155;
					int [] array = new int[arrSize];

					for (int i = 0; i < array.length; i++) {
						array[i] = LB + (int) (Math.random() * (UB - LB + 1));
					}

					message = "The array is: " + Arrays.toString(array);
					JOptionPane.showMessageDialog(null, message);

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

		message = "E. Even or odd\n" +
				  "R. Randomly fill an array\n" +
				  "Q. Quit the program";

		inputLine = JOptionPane.showInputDialog(message, "Enter a selection...");

		inputLine = inputLine.toUpperCase();

		result = inputLine.charAt(0);

		return result;

	}

}

