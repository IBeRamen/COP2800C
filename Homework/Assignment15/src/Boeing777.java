
public class Boeing777 implements Aircraft {
	
	int speed = 0;

	public String manufacturer() {
		return "Manufacturer: Boeing";
	}
	
	public void increaseSpeed(int faster) {
		speed = speed + faster;
	}
	
	public void decreaseSpeed(int slower) {
		speed = speed - slower;
	}
	
	public int amtofEngines() {
		return 4;
	}
	
	public String toString() {
		return "Current speed: " + speed;
	}
}