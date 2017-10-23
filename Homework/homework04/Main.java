package homework04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Create rectangle 1
		Rectangle rectangle1 = new Rectangle(10,5);
		
		System.out.print(rectangle1.toString());
		
		System.out.print("\nArea: " + rectangle1.getArea() + "\nPerimeter: " + rectangle1.getPerimeter());
		
		// Create rectangle 2 and ask for input
		Rectangle rectangle2 = new Rectangle();

		System.out.println("\n\nEnter the width of the rectangle:");
		rectangle2.setWidth(in.nextDouble());
		
		System.out.println("Enter the height of the rectangle:");
		rectangle2.setHeight(in.nextDouble());
		
		System.out.print(rectangle2.toString());
		
		System.out.print("\nArea: " + rectangle2.getArea() + "\nPerimeter: " + rectangle2.getPerimeter());
		
	}

}
