public abstract class Person implements AthleteInfo {

	public String firstName;
	public String middleName;
	public String lastName;
	public int age;

	public Person(String firstName, String middleName, String lastName, int age) {
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setAge(age);
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		
		this.middleName = middleName.substring(0, 1).toUpperCase();

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Polymorphism (overrides java object toString)
	@Override
	public String toString() {
		if (middleName == " ") {
			return firstName + " " + lastName + "\nAge: " + age;
		} else {
			return firstName + " " + middleName + " " + lastName + "\nAge: " + age;
		}
	}

	// Abstract method implemented from AtheleteInfo interface
	public String doThis() {
		return null;
	}
}
