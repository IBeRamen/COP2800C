import javax.swing.JOptionPane;

/**
 *
 * @author Omar Rahman, Richard Haynes III, Jake Ortiz, Minh Vu
 * Class worked on by everyone
 * @date Oct 29, 2017
 *
 */

public class TestClass {
	
	private static int playerCounter = 0;

	public static void main(String[] args) {
		
		// Create the slots object array
		SlotMachine slots[] = new SlotMachine[3];
		
		// Create the default three machines
		slots[0] = new SlotMachine("Lucky 777", 5000, 10000, 5000, 10, 5);
		slots[1] = new SlotMachine("Lucky Lotto", 55000, 100000, 75000, 50, 25);
		slots[2] = new SlotMachine("Purple People Eater", 1000, 50, 40, 5, 2);
		
		// Create the players object array (Max of 50)
		Player players[] = new Player[50];
		
		// Create the default player (Vera)
		players[0] = new Player(new Name("Susie", "V", "Vera", "III"), new Date(1, 15, 1990), 500);
		playerCounter++;
	
		char choice;

		do {
			choice = getChoice();

			switch(choice) {
				// Add a player
				case 'A':
					addPlayer(players);
					break;
				// Slot machine information
				case 'B':
					String message = "Lucky 777: Jackpot odds are 1 in 10,000. Jackpot pays $5,000.\n" +
							  "Regular odds are 1 in 10. Regular payout is $5.00.\n\n" +
							  "Lucky Lotto: Jackpot odds are 1 in 100,000. Jackpot pays $75,000.\n" +
							  "Regular odds are 1 in 50. Regular payout is $25.00.\n\n" +
							  "Purple People Eater: Jackpot odds are 1 in 50. Jackpot pays $40.00.\n" +
							  "Regular odds are 1 in 5. Regular payout is $2.00.\n\n";
					JOptionPane.showMessageDialog(null, message);
					break;
				// Play slots
				case 'C':
					playSlots(slots, players);
					break;
				// Show all players
				case 'D':
					showPlayers(players);
					break;
				case 'Q':
					JOptionPane.showMessageDialog(null, "Thanks for playing!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid selection... try again.");
					break;
			}
		} while (choice != 'Q');

	} // end main

	public static char getChoice() {
		
		char result = ' ';

		String inputLine, message;

		message = "A. Add a player\n" +
				  "B. Slot Machine Info\n" +
				  "C. Play slots!\n" +
				  "D. Display all players\n" +
				  "Q. Quit";

		inputLine = JOptionPane.showInputDialog(message, "Enter a selection...");

		inputLine = inputLine.toUpperCase();

		result = inputLine.charAt(0);

		return result;
	} // end getChoice
	
	public static void playSlots(SlotMachine slots[], Player players[]) {
		
		int amtWon = 0;
		char playAgain = 'Y';
	
		
		while (playAgain == 'Y' || playAgain == 'y') {
			
			// Ask the user for which player
			Player p = players[SlotMachine.selectPlayer(players)];
			
			// Ask the user for which slot machine
			SlotMachine slotMachine = slots[SlotMachine.selectSlot(slots)];
			
			// Subtract one from player
			p.subtractBalance(1);
			
			// Show balance before
			JOptionPane.showMessageDialog(null, "Current balance $" + p.getBalance() + "\n(It costs $1 to play a machine).");
			
			JOptionPane.showMessageDialog(null, "SPIN!");
			
			// Play the game
			amtWon = slotMachine.play();
			
			// Display result
			if (amtWon > 0) {
				p.addBalance(amtWon); // add money won to the players balance
				JOptionPane.showMessageDialog(null, "YOU WON! Your new balance is: $" + p.getBalance());
			}
			else {
				JOptionPane.showMessageDialog(null, "YOU LOST! Your current balance is: $" + p.getBalance());
			}
			
			playAgain = JOptionPane.showInputDialog("Would you like to play again?", "Y/N").charAt(0);
		}

	} // end playSlots
	
	public static void showPlayers(Player players[]) {
		String message = "";
		
		int i = 1;
		
		for (Player p : players) {
			if (p != null) { // dont show null values
				message += i++ + ") " + p + "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, message);
		
	} // end showPlayers

	public static void addPlayer(Player players[]) {
		
		Name name = new Name();
		Date dob = new Date();
		Player newPlayer = new Player();
		
		String firstName, middleInitial, lastName, suffix;
		
		int month, day, year, balance;
		
		// Get the players name
		firstName = name.setFirstName();
		middleInitial = name.setMiddleInitial();
		lastName = name.setLastName();
		suffix = name.setSuffix();
		
		// Get the players DOB
		month = dob.setMonth();
		day = dob.setDay();
		year = dob.setYear();
		
		// Check the players age
		dob.isOldEnough(year, month, day);
		
		// Get the players starting balance
		balance = newPlayer.setBalance();
		
		// Add user input to the player array
		players[playerCounter] = new Player(new Name(firstName, middleInitial, lastName, suffix), new Date(month, day, year), balance);		
		playerCounter++;
		
		// Display success message
		JOptionPane.showMessageDialog(null, "Success player added! Total players in the game: " + playerCounter + "/" + players.length);
	} // end addPlayer

} // end main
