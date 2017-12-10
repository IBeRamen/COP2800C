import javax.swing.JOptionPane;

/**
*
* @author Omar Rahman, Richard Haynes III, Jake Ortiz, Minh Vu
* Class worked on by Jake & Minh
* @date Oct 29, 2017
*
*/

public class Name {
	
	String firstName, middleInitial, lastName, suffix ;
	
	public Name() {}
	
	public Name(String firstName, String middleInitial, String lastName, String suffix) {
		this.firstName = firstName;
		this.middleInitial = (middleInitial == null) ? "" : middleInitial;
		this.lastName = lastName;
		this.suffix = (suffix == null) ? "" : suffix;
	}
	
	public String setFirstName() {
		
		// Get the first name from the user
		do {
			firstName = JOptionPane.showInputDialog("Please enter the players first name");
			
			// Make sure the first name is less than 12 characters
			if (firstName.length() > 12) {
				JOptionPane.showMessageDialog(null, "Please enter a first name that is less than 12 characters!");
			}
		} while (firstName.length() > 12);
		
		// Make the first letter capital
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		
		return firstName;
	}
	
	public String setMiddleInitial() {
		
		// Get the middle initial from the user
		do {
			middleInitial  = JOptionPane.showInputDialog("Please enter the middle initial (Press enter for none)");
			
			if (middleInitial.length() > 1) {
				JOptionPane.showMessageDialog(null, "Please enter a middle initial that is one character!");
			}
		} while (middleInitial.length() > 1);
		
		// Make the middle initial upper case
		middleInitial = middleInitial.toUpperCase();
		
		return middleInitial;
	}
	
	public String setLastName() {
		
		// Get the last name from the user
		do {
			lastName = JOptionPane.showInputDialog(null, "Please enter a last name");
			
			if (lastName.length() > 20) {
				JOptionPane.showMessageDialog(null, "Please enter a last name that is less than 20 characters!");
			}
		} while (lastName.length() > 20);
		
		// Make the first letter capital
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		
		return lastName;
	}
	
	public String setSuffix() {
		
		// Get the suffix from the user
		do {
			suffix = JOptionPane.showInputDialog(null, "Please enter a suffix (Press enter for none)");
			
			if (suffix.length() > 3) {
				JOptionPane.showMessageDialog(null, "Please enter a suffix that is less than 3 characters!");
			}
		} while (suffix.length() > 3);
		
		// Make the suffix upper case
		suffix = suffix.toUpperCase();
		
		return suffix;
	}
	
	public String toString() {
		return firstName + (middleInitial != "" ? " " + middleInitial : "") + " " + lastName + (suffix != "" ? " " + suffix : "");
	}

}
