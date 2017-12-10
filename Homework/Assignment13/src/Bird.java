
public class Bird extends Animal {
	
	private double wingSpan;
	
	private boolean canFly;
	
	public Bird(int weight, int height, double wingSpan, boolean canFly) {
		super(weight, height);
		setWingSpan(wingSpan);
		setCanFly(canFly);
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	public boolean canFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public String toString() {
		String result;
		
		result = "Bird:\n"
				+ "Wing span: " + wingSpan
				+ "\nCan Fly?: " + canFly
				+ "\n" + super.toString();
		
		return result;
	}

}
