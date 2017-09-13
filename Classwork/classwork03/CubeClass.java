package classwork03;

import java.util.Scanner;

public class CubeClass {

	public static void cubeIt() {

		Scanner scan = new Scanner(System.in);

		int value;
		int result;

		System.out.println("Enter a number to cube: ");
		value = scan.nextInt();

		//result = (int) Math.pow(value, 3);
		result = value * value * value;

		System.out.println("The cube of " + value + " is " + result);
	}

}

