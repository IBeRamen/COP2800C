
public class Yacht implements Boat {
	
	int speed = 0;
	
	public String manufacturer() {
		return "Manufacturer: Amels";
	}
	
	public String typeOfBoat() {
		return "Type: Yacht";
	}

	public String boatName() {
		return "Boat Name: Elizabeth";
	}

	public void increaseSpeed(int faster) {
		speed = speed + faster;
	}
	
	public void decreaseSpeed(int slower) {
		speed = speed - slower;
	}

	public int priceOfBoat() {
		return 1000000;
	}
	
	public String toString() {
		return "Current speed: " + speed;
	}

}
