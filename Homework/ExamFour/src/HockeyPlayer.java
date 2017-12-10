public class HockeyPlayer extends Athlete {

	private String stickBrand;

	public HockeyPlayer(String firstName, String middleName, String lastName, int age, String team, String position,
			String stickBrand) {
		super(firstName, middleName, lastName, age, team, position);
		setStickBrand(stickBrand);
	}

	public String getStickBrand() {
		return stickBrand;
	}

	public void setStickBrand(String stickBrand) {
		this.stickBrand = stickBrand;
	}

	// Polymorphism
	@Override
	public String toString() {
		String result = super.toString();
		result += "\nMy stick brand is " + stickBrand;
		return result;
	}

	// Polymorphism
	public String doThis() {
		String message;
		
		message = "I sit in a penalty box.";
		
		return message;
	}
}
