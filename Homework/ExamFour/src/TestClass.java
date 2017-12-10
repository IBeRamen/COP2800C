import javax.swing.JOptionPane;

public class TestClass {

	public static void main(String[] args) {
		
		char choice;

		// Create the Person array
		Person players[] = new Person[100];

		players[0] = new BaseballPlayer("Hank", "H", "Aaron", 23, "Red Sox", "Catcher", true, false);

		players[1] = new FootBall("Terry", "F.", "Bradshaw", 34, "Gaints", "Quarterback", true, false, false);

		players[2] = new HockeyPlayer("Mario", " ", "Lemieux", 25, "Red Wings", "Goalie", "Tomato");

		players[3] = new Golfer("Tiger", "T.", "Woods", 27, "Europe", "Golfer");

		players[4] = new BaseballPlayer("Barry", "B.", "Bonds", 25, "Yankees", "pitcher", false, false);

		players[5] = new FootBall("Payton", "A.", "Manning", 31, "Eagels", "Catcher", true, false, false);

		players[6] = new HockeyPlayer("Wayne", " ", "Gretzky", 22, "Solar Bears", "forward", "Potato");

		players[7] = new Golfer("Phil", "A", "Mickleson", 26, "Japan", "captain");
		
		// Additional player
		players[8] = new Golfer("Steve", "T.", "Jordan", 27, "United Kingdom", "Nike");
		
		
		// Menu system
		do {
			choice = getChoice();

			switch(choice) {
				// Show players
				case 'A':
					showPlayers(players);
					break;
				// List players of the same sport
				case 'B':
					showSameSportPlayers(players);
					break;
				// Do this
				case 'C':
					showDoThis(players);
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

		message = "A. Show all players" +
				  "\nB. List players of the same sport" +
				  "\nC. Call doThis() for each player" +
				  "\nQ. Quit";

		inputLine = JOptionPane.showInputDialog(message, "Enter a selection...");

		inputLine = inputLine.toUpperCase();

		result = inputLine.charAt(0);

		return result;
	} // end getChoice
	
	public static void showPlayers(Person players[]) {
		String message = "";
		
		int i = 1;
		
		for (Person p : players) {
			if (p != null) { // dont show null values
				message += i++ + ") " + p + "\n\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, message);
		
	} // end showPlayers
	
	public static void showSameSportPlayers(Person players[]) {
		String message = "";
		String menu;
		
		int i = 1;
		
		char selection = ' ';

		String inputLine;

		menu = "A. Baseball" +
				  "\nB. Football" +
				  "\nC. Golf" +
				  "\nD. Hockey" +
				  "\nQ. Go back";

		inputLine = JOptionPane.showInputDialog(menu, "Enter a selection...");

		inputLine = inputLine.toUpperCase();

		selection = inputLine.charAt(0);
		
		
		switch(selection) {
			case 'A':
				// Show baseball players
				for (Person p : players) {
					if (p != null && p instanceof BaseballPlayer) {
						message += i++ + ") " + p + "\n\n";
					}
				}
				JOptionPane.showMessageDialog(null, message);
				break;
				
			case 'B':
				// Show football players
				for (Person p : players) {
					if (p != null && p instanceof FootBall) {
						message += i++ + ") " + p + "\n\n";
					}
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case 'C':
				// Show golf players
				for (Person p : players) {
					if (p != null && p instanceof Golfer) {
						message += i++ + ") " + p + "\n\n";
					}
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case 'D':
				// Show hockey players
				for (Person p : players) {
					if (p != null && p instanceof BaseballPlayer) {
						message += i++ + ") " + p + "\n\n";
					}
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case 'Q':
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid selection... try again.");
				break;
		}
		
	}
	
	public static void showDoThis(Person players[]) {
		String message = "";
		
		int i = 1;
		
		for (Person p : players) {
			if (p != null) {
				message += i++ + ") " + p.getFirstName() + ": " + p.doThis() + "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, message);
		
	} // end showDoThis
}
