package classwork03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		char userChoice = ' ';
		String name = " ";

		do {
			userChoice = getUserChoice();

			switch(userChoice) {
				case 'D':
					name = nameMethod();
					break;
				case 'C':
					CubeClass.cubeIt();
					break;
				case 'R':
					reverseName(name);
					break;
				case 'Q':
					System.out.println("Have a good day!");
					break;
				default:
					System.out.println("Invalid selection.");
					break;
			}

		} while (userChoice != 'Q');

	}

	public static void displayMenu() {
		System.out.println("[D]isplay name");
		System.out.println("[C]ube a number");
		System.out.println("[R]everse name");
		System.out.println("[Q]uit\n");
		System.out.println("Enter a selection: ");
	}

	public static char getUserChoice() {
		char result = ' ';

		String lineofStuff;

		Scanner scan = new Scanner(System.in);

		displayMenu();

		lineofStuff = scan.next();

		result = lineofStuff.toUpperCase().charAt(0);

		return result;
	}

	public static String nameMethod() {
		String result = " ";

		int timesToPrint = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name: ");
		result = scan.nextLine();

		System.out.println("How many time do you want your name to show?: ");
		timesToPrint = scan.nextInt();

		for (int i = 0; i < timesToPrint; i++) {
			System.out.println(i+1 + ") " + result);
		}

		return result;

	}

	public static void reverseName(String name) {
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println(" ");
	}

}
