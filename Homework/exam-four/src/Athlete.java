public class Athlete extends Person {
	
	private String team;
	private String position;

	public Athlete(String firstName, String middleName, String lastName, int age, String team, String position) {
		super(firstName, middleName, lastName, age);
		this.team = team;
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	// Polymorphism
	@Override
	public String toString() {
		
		return "Name: " + firstName + " " + lastName +
				"\nAge: " + age +
				"\nTeam: " + team + 
				"\nPosition: " + position;
	}
}
