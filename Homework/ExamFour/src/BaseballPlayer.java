public class BaseballPlayer extends Athlete {

	private boolean batLeftHanded;
	private boolean batRightHanded;

	public BaseballPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			boolean batLeftHanded, boolean batRightHanded) {
		super(firstName, middleName, lastName, age, team, position);
		setBatLeftHanded(batLeftHanded);
		setBatRightHanded(batRightHanded);
	}

	public boolean isBatLeftHanded() {
		return batLeftHanded;
	}

	public void setBatLeftHanded(boolean batLeftHanded) {
		this.batLeftHanded = batLeftHanded;
	}

	public boolean isBatRightHanded() {
		return batRightHanded;
	}

	public void setBatRightHanded(boolean batRightHanded) {
		this.batRightHanded = batRightHanded;
	}

	// Polymorphism
	@Override
	public String toString() {
		String result = super.toString();
		if (batLeftHanded == true && batLeftHanded == true)
			result += "\nHand: This player bats left handed";
		else if (batLeftHanded)
			result += "\nHand: This player bats left handed";
		else if (batRightHanded)
			result += "\nHand: This player bats right handed";
		return result;
	}

	// Polymorphism
	public String doThis() {
		String message;
		
		message = "I hit something.";
		
		return message;
	}
}
