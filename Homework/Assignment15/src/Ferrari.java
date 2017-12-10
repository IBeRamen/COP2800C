
public class Ferrari implements Vehicle {
	
	int speed = 0;
	
	public String carName() {
		return "Name: Ferrari 458";
	}
	
	public String carType() {
		return "Type: Sport";
	}
	
	public void increaseSpeed(int faster) {
		speed = speed + faster;
	}
	
	public void decreaseSpeed(int slower) {
		speed = speed - slower;
	}
	
	public String transmissionType() {
		return "Transmission: Automatic/Manual";
	}
	
	public String toString() {
		return "Current Speed: " + speed;
	}

}
