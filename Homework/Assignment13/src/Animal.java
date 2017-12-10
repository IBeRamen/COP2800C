
public class Animal {
	
	private int weight, height;
	
	public Animal(int weight, int height) {
		setWeight(weight);
		setHeight(height);
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		String result;
		
		result = "Weight: " + weight
				 + "\nHeight: " + height + "\n";
		
		return result;
	}

}
