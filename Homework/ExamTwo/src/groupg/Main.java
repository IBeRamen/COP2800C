package groupg;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

// Complete
// 4 or more methods
// Output to text
// Output number of times played
// Results each time Versa wins
// Input the number of quarters in Versa's jar (100)
// Amount won output (dollars and cents)
// Current number of quarters remaining in the jar
// Once broke, output total number of times Versa was able to play
// Output the number of the machine she won
// (Optional) Spin animation
// One dimensional array
// Boolean variable with purpose

/**
 * The class Main contains the code for the menu and calling the slot machine.
 *
 * @author Group G: Nicoli Perez, Omar Rahman, and Phillip Tat
 * @date Oct 13, 2017
 * @purpose Exam 2: Vera goes to Vegas
 *
 */

public class Main {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Counter variables for the respective machines
		 * Quarters variable for the quarters Versa starts with
		 * Total Turns variable for the total turns Versa played
		 */
		int totalTurns = 0;
		char choice;
		boolean bankrupt = false;
		int size = 5;
		int [] counters = new int[size];
		File file = new File("output.txt");
		counters[0] = 100; // index 0 will be the quarter counter
		
		do {
			choice = getChoice();

			switch(choice) {
				case 'A':					
					javax.swing.SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                SlotMachineGUI.createAndShowGUI(); 
			            }
			        });
					
					/**
					 * Attempt to create the file and catch an IOException occurs.
					 * If successful, proceed with playing the game.
					 */
					try( PrintWriter output = new PrintWriter(file) ) {
						while (!bankrupt) {
							// check if bankrupt or not
							bankrupt = counters[0] <= 0;							
							if (!bankrupt) {
								counters[0]--;
								counters[1]++;
								SlotMachine.machineOne(counters, file, output);
							}
							bankrupt = counters[0] <= 0;
							if (!bankrupt) {
								counters[0]--;
								counters[2]++;
								SlotMachine.machineTwo(counters, file, output);
							}
							bankrupt = counters[0] <= 0;
							if (!bankrupt) {
								counters[0]--;
								counters[3]++;
								SlotMachine.machineThree(counters, file, output);
							}
							bankrupt = counters[0] <= 0;
							if (!bankrupt) {
								counters[0]--;
								counters[4]++;
								SlotMachine.machineFour(counters, file, output);
							}
						}
						
						totalTurns = counters[1] + counters[2] + counters[3] + counters[4];
						
						output.println("You played a total of: " + totalTurns +" times before you went broke.");
						output.close();					
					} // end try
					
					catch(IOException error) {			
						JOptionPane.showMessageDialog(null, "Could not use the IO file!");
					} // end catch
					break;
					
				case 'Q':
					JOptionPane.showMessageDialog(null, "Thank you for playing!");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Invalid selection.");
					break;
			}
		} while (choice != 'Q' && choice != 'A');
		
	} // end main
	
	public static char getChoice() {
		char result = ' ';
		String inputLine, message;

		message = "A. Play\n" + "Q. Quit";
		inputLine = JOptionPane.showInputDialog(message, "Enter a selection...");
		inputLine = inputLine.toUpperCase();
		result = inputLine.charAt(0);

		return result;
	}

}