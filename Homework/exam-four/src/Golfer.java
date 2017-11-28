public class Golfer extends Athlete {

	private String mainSponsor;

	public Golfer(String firstName, String middleName, String lastName, int age, String team, String mainSponsor) {

		super(firstName, middleName, lastName, age, team, mainSponsor);
		setMainSponsor(mainSponsor);
	}

	public String getMainSponsor() {
		return mainSponsor;
	}

	public void setMainSponsor(String mainSponsor) {
		this.mainSponsor = mainSponsor;
	}

	// Polymorphism
	public String doThis() {
		String message;
		
		message = "I Putt It in the Hole.";
		
		return message;
	}

	// Polymorphism
	@Override
	public String toString() {
		String result = super.toString();

		result += " I am a Golfer.\n" + "I am sponsored by " + mainSponsor;

		return result;
	}// end toString

} // end class Golfer
