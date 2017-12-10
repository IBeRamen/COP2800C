import java.time.LocalDate;
import java.util.Calendar;

import javax.swing.JOptionPane;

/**
*
* @author Omar Rahman, Richard Haynes III, Jake Ortiz, Minh Vu
* Class worked on by Jake and Minh
* @date Oct 29, 2017
*
*/

public class Date {

	int month, day, year;
	
	public Date() {}
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int setMonth() {
		
		// If the month is less than 1 or more than 12 show warning and reprompt
		while (month < 1 || month > 12) {
			month = Integer.parseInt(JOptionPane.showInputDialog("Please enter the DOB month"));
			
			if (month < 1 || month > 12) {
				JOptionPane.showMessageDialog(null, "Please enter a month between 1 - 12");
			}
		}
		
		return month;
	}
	
	public int setDay() {
		
		// Make sure the days are between 1 and 31
		while (day < 1 || day > 31) {
			day = Integer.parseInt(JOptionPane.showInputDialog("Please enter the DOB day"));
			
			if (day < 1 || day > 31) {
				JOptionPane.showMessageDialog(null, "Please enter a day between 1 - 31");
			}
		}
		
		return day;
	}
	
	public int setYear() {
		
		// Make sure the year is between 1900 and 2017
		while (year < 1900 || year > 2017) {
			year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the DOB year"));
			
			if (year < 1900 || year > 2017) {
				JOptionPane.showMessageDialog(null, "Please enter a year between 1900 - 2017");
			}
		}
		
		return year;
	}
	
	public void isOldEnough(int year, int month, int day) {
		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
		int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		
		LocalDate playerDOB = LocalDate.of(year, month, day);
		LocalDate legalAge = LocalDate.of(currentYear - 21, currentMonth, currentDay - 1);

		if (playerDOB.compareTo(legalAge) > 0) {
			JOptionPane.showMessageDialog(null, "Sorry you have to be 21 or older to play! Shutting down...");
			System.exit(0);
		}
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
}
