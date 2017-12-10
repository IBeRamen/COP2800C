import javax.swing.JOptionPane;

/**
*
* @author Omar Rahman, Richard Haynes III, Jake Ortiz, Minh Vu
* Class worked on by Omar Rahman & Richard
* @date Oct 29, 2017
*
*/

public class Player {
	
	private Name name;
	private Date dob;
	
	private int balance;
	
	public Player() {}
	
	public Player(Name name, Date dob, int balance) {
		this.name = name;
		this.dob = dob;
		this.balance = balance;
	}
	
	public Name getName() {
		return name;
	}
	
	public Date getDOB() {
		return dob;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void subtractBalance(int amt) {
		balance -= amt;
	}
	
	public void addBalance(int amt) {
		balance += amt;
	}
	
	public int setBalance() {
		
		// Make sure the balance is at least 1
		while (balance < 1) {
			balance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the starting balance for the player"));
			
			if (balance < 1) {
				JOptionPane.showMessageDialog(null, "Please enter a number greater than 1!");
			}
		}
		
		return balance;
		
	}
	
	public String toString() {
		return "\nPlayer Name: " + name +
				"\nDOB: " + dob +
				"\nBalance: $" + balance + "\n";
	}

}
