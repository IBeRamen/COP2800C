
public class Cat extends Animal {
	
	private String name;
	
	private int lives;
	
	public Cat(int weight, int height, String name, int lives) {
		super(weight, height);
		setName(name);
		setLives(lives);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getLives() {
		return lives;
	}
	
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public String toString() {
		String result;
		
		result = "Cat:\n"
				 + "Name: " + name
				 + "\nLives: " + lives
				 + "\n" + super.toString();
		
		return result;
	}

}
