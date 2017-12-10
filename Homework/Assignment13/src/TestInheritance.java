import java.util.Scanner;

public class TestInheritance {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int killCat = -1;
		
		// Create a dog
		Dog myDog = new Dog(100, 40, "Steve", "German Shepard" , "01/20/2017");
		
		// Create a cat
		Cat myCat = new Cat(10, 3, "Fluffy", 9);
		
		// Create a bird
		Bird myBird = new Bird(3, 2, 10, true);
		
		// Print my animals
		System.out.println(myDog + "\n" + myCat + "\n" + myBird);
		
		// Cats have 9 lives, so you need to keep track of the remaining lives once a cat dies
		System.out.println("How many times would you like to kill the cat?");
		killCat = input.nextInt();
		
		myCat.setLives(myCat.getLives() - killCat);
		
		System.out.println("The cat now has " + myCat.getLives() + " remaining live(s).");

	}

}
