
public class Dog extends Animal {
	
	private String name, breed, dob;
	
	public Dog(int weight, int height, String name, String breed, String dob) {
		super(weight, height);
		setName(name);
		setBreed(breed);
		setDOB(dob);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getDOB() {
		return dob;
	}
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	// Thanks but no thanks (Overriding)
	public String toString() {
		String result;
		
		result = "Dog:\n"
				+ "Name: " + name
				+ "\nBreed: " + breed
				+ "\nDOB: " + dob
				+ "\n" + super.toString();
		
		return result;
	}

}
