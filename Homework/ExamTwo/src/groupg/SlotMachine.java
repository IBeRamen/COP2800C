package groupg;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

/**
 * The class SlotMachine contains the code for outputting, modifying and handling every slot machine.
 * Machine 1: Pays 25 quarters every 33th time it is played.
 * Machine 2: Pays 75 quarters every 99th time it is played.
 * Machine 3: Pays 7 quarters every 9th time it is played.
 * Machine 4: Pays 1 quarter every 3rd time it is played.
 *
 * @author Group G: Nicoli Perez, Omar Rahman, and Phillip Tat
 * @date Oct 13, 2017
 * @purpose Exam 2: Vera goes to Vegas
 *
 */

public class SlotMachine {
	
	/**
	 * Machine 1
	 * 
	 * @param quarters
	 * 		the amount of quarters currently held.
	 * @param counterOne
	 * 		the control variable for every time it is played.
	 * @param output
	 * 		the output file.
	 * @return the amount of quarters
	 * @throws IOException
	 */
	public static void machineOne(int [] counters, File file, PrintWriter output) throws IOException {
		int machineWonAt = 1;
		double quartersWon = 25;
		
		if (counters[0] > 0) {
			if ((counters[1] % 33) == 0) {
				counters[0] += quartersWon;
				printToTextFile(counters, quartersWon, file, output, machineWonAt);
			}
		}
		
	}
	
	/**
	 * Machine 2
	 * 
	 * @param quarters
	 * 		the amount of quarters currently held.
	 * @param counterOne
	 * 		the control variable for every time it is played.
	 * @param output
	 * 		the output file.
	 * @return the amount of quarters
	 * @throws IOException
	 */
	public static void machineTwo(int [] counters, File file, PrintWriter output) throws IOException {
		int machineWonAt = 2;
		double quartersWon = 75;
		
		if (counters[0] > 0) {
			if((counters[2] % 99) == 0) {
				counters[0] += quartersWon;
				printToTextFile(counters, quartersWon, file, output, machineWonAt);
			}
		}
		
	}
	
	/**
	 * Machine 3
	 * 
	 * @param quarters
	 * 		the amount of quarters currently held.
	 * @param counterOne
	 * 		the control variable for every time it is played.
	 * @param output
	 * 		the output file.
	 * @return the amount of quarters
	 * @throws IOException
	 */
	public static void machineThree(int [] counters, File file, PrintWriter output) throws IOException {
		int machineWonAt = 3;
		double quartersWon = 7;
		
		if (counters[0] > 0) {
			if((counters[3] % 9) == 0) {
				counters[0] += quartersWon;
				printToTextFile(counters, quartersWon, file, output, machineWonAt);
			}
		}

	}
	
	/**
	 * Machine 4
	 * 
	 * @param quarters
	 * 		the amount of quarters currently held.
	 * @param counterOne
	 * 		the control variable for every time it is played.
	 * @param output
	 * 		the output file.
	 * @return the amount of quarters
	 * @throws IOException
	 */
	public static void machineFour(int [] counters, File file, PrintWriter output) throws IOException {
		int machineWonAt = 4;
		double quartersWon = 1;
		
		if (counters[0] > 0) {
			if((counters[4] % 3) == 0) {
				counters[0] += quartersWon;
				printToTextFile(counters, quartersWon, file, output, machineWonAt);
			}
		}

	}
	
	/**
	 * Print to text file
	 * 
	 * @param quarters
	 * 		current quarters in the jar.
	 * @param quartersWon
	 * 		amount of quarters won based on the machine.
	 * @param output
	 * 		the output file.
	 * @param machineWonAt
	 *		the machine Versa has one at.
	 */
	public static void printToTextFile(int [] counters, double quartersWon, File file, PrintWriter output, int machineWonAt) throws IOException {
		double money = quartersWon / 4;
		double totalMoney = counters[0] / 4;
		DecimalFormat numForm = new DecimalFormat("#.00");
		
		output.println("Congrats you won: $" + numForm.format(money) + " at machine: " + machineWonAt + "!");
		output.println("You now have " + counters[0] + " quarters which is a total of $" +
						numForm.format(totalMoney) + " in your balance!");
	}

}