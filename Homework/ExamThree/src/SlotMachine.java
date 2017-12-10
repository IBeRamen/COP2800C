import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.JOptionPane;

/**
*
* @author Omar Rahman, Richard Haynes III, Jake Ortiz, Minh Vu
* Class worked on by Omar & Richard
* @date Oct 29, 2017
*
*/

public class SlotMachine {
	
	// Create a new random object
	Random rand = new Random();
	
	String machineName;
	
	@SuppressWarnings("unused")
	private int machineBalance, jackpotOdds, jackpotPayAmount, regularWinOdds, regularPayout;
	
	@SuppressWarnings("unused")
	private boolean noJackpotPaid, noRegularWinPaid;
	
	private int jackpotNum, regularNum[];
	
	public SlotMachine(String machineName, int machineBalance, int jackpotOdds, int jackpotPayAmount, 
			int regularWinOdds, int regularPayout) {
		this.machineName = machineName;
		this.machineBalance = machineBalance;
		this.jackpotOdds = jackpotOdds;
		this.jackpotPayAmount = jackpotPayAmount;
		this.regularWinOdds = regularWinOdds;
		this.regularPayout = regularPayout;
		
		// Generate a random jackpot number based on given odds
		jackpotNum = rand.nextInt() % jackpotOdds;
		
		// Generate a unique set of random numbers based on the regular odds and jackpot odds
		regularNum = shuffleMachine(jackpotOdds, jackpotOdds / regularWinOdds);
		
		// Sort the array based on the random number
		Arrays.sort(regularNum);
	}
	
	// This shuffles the array based on the odds of winning (jackpot and regular odds)
	private int[] shuffleMachine(int odds, int i) {
		int result[] = new int[i];
		
		// Make a new array list
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int j = 1; j <= odds; j++) {
			list.add(new Integer(j));
		}
		
		// Shuffle
		Collections.shuffle(list);
		
		for (int j = 0; j < i; j++) {
			result[j] = list.get(j);
		}
		
		return result;
	} // end shuffleMachine
	
	public int play() {
		
		// Generate random spin number
		int randNum = rand.nextInt() % jackpotOdds + 1;
		
		// If the user has hit the jackpot
		if (randNum == jackpotNum) {
			// Change the no jackpot paid to false
			noJackpotPaid = false;
			
			// Subtract the jackpot balance from the machine
			machineBalance =- jackpotPayAmount;
			
			// Display jackpot to the user and amount won
			String message = "-=-=-=-=-=-=-=-=-= JACKPOT! -=-=-=-=-=-=-=-=-=\n" +
							 "Total win amount: $" + jackpotPayAmount;
			
			JOptionPane.showMessageDialog(null, message);
			
			return jackpotPayAmount;
		} 
		
		// If the user hit a regular win
		else if (Arrays.binarySearch(regularNum, randNum) != -1) {
			// Change no regular paid to false
			noRegularWinPaid = false;
			
			// Subtract the regular amount paid from the machine
			machineBalance =- regularPayout;
			
			// Display regular win to the user and amount won
			String message = "-=-=-=-=-=-=-=-=-= WINNER! -=-=-=-=-=-=-=-=-=\n" +
					 "Total win amount: $" + regularPayout;
	
			JOptionPane.showMessageDialog(null, message);
			
			return regularPayout;
		}
		
		// Else the user lost
		else {
			// Display loss to the user
			String message = "-=-=-=-=-=-=-=-=-= LOSER! -=-=-=-=-=-=-=-=-=\n" +
					 "Total win amount: $0";
	
			JOptionPane.showMessageDialog(null, message);
			
			return 0;
		}
	} // end play

	public static int selectPlayer(Player players[]) {
		int choice = 0, i = 1;
		
		String message = "";
		
		// While loop if the user chooses a choice less than 1 or more than 50
		while (choice < 1 || choice > players.length) {
			
			// Show warning
			if (choice < 1 || choice > players.length) {
				JOptionPane.showMessageDialog(null, "Please select a player");
			}
			
			// Show the players by looping through the players array
			for (Player p : players) {
				if (p != null) { // skip the null values
					message += i++ + ") " + p + "\n";
				}
			}
			
		    choice = Integer.parseInt(JOptionPane.showInputDialog(message, "Please select a player"));
			
		}

		return choice - 1;
	} // end select player
	
	public static int selectSlot(SlotMachine slots[]) {
		int choice = 0, i = 1;
		
		String message = "";
		
		// While loop if the user chooses a choice less than 1 or more than slots array length
		while (choice < 1 || choice > slots.length) {
			
			// Show warning
			if (choice < 1 || choice > slots.length) {
				JOptionPane.showMessageDialog(null, "Please select a slot number between 1 and " + slots.length);
			}
			
			// Show the slots
			for (SlotMachine s : slots) {
				message += i++ + ") " + s + "\n";
			}
			
			choice = Integer.parseInt(JOptionPane.showInputDialog(message, "Please select a choice between 1 - " + slots.length));
		}
		
		return choice - 1;
	} // end select slot

	public String toString() {
		return "Machine Name: " + machineName +
				"\nJackpot Payout: $" + jackpotPayAmount +
				"\nRegular Payout: $" + regularPayout + "\n";
	}

}
