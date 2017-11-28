public class FootBall extends Athlete {
	
	private String specialty;
	private boolean offense;
	private boolean defense;
	private boolean specialTeams;

	public FootBall(String firstName, String middleName, String lastName, int age, String team, String position,
			Boolean offense, Boolean defense, Boolean specialTeams) {
		super(firstName, middleName, lastName, age, team, position);
		setOffense(offense);
		setDefense(defense);
		setSpecialTeams(specialTeams);
	} // end constructor with arguments

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		if (offense) {
			specialty = "Offense";
		} else if (defense) {
			specialty = "Defense";
		} else
			specialty = "Special Teams";
		this.specialty = specialty;
	}

	public boolean getOffense() {
		return offense;
	}

	public void setOffense(Boolean offense) {
		this.offense = offense;
	}

	public boolean getDefense() {
		return defense;
	}

	public void setDefense(Boolean defense) {
		this.defense = defense;
	}

	public boolean getSpecialTeams() {
		return specialTeams;
	}

	public void setSpecialTeams(Boolean specialTeams) {
		this.specialTeams = specialTeams;
	}

	// Polymorphism
	public String toString() {
		
		String result = super.toString();
		
		if (offense == true && defense == true && specialTeams == true) {
			result += "\nSpecialty: I play offense, defense, and special teams.";
		} else if (offense == true && defense == true) {
			result += "\nSpecialty: I play offense and defense.";
		} else if (offense == true && specialTeams == true) {
			result += "\nSpecialty: I play offense and special teams.";
		} else if (defense == true && specialTeams == true) {
			result += "\nSpecialty: I play defense and special teams.";
		} else if (offense == true) {
			result += "\nSpecialty: I play offense.";
		} else if (defense == true) {
			result += "\nSpecialty: I play defense.";
		} else if (specialTeams == true) {
			result += "\nSpecialty: I play special teams.";
		}
		return result;
	}

	// Polymorphism
	public String doThis() {
		String message;
		
		message = "I tackle something.";
		
		return message;
	}
} // end Football
