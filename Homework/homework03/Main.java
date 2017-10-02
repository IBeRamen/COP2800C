package homework03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("On average, how many beers will you consume each day?");
		double consume = in.nextDouble();

		System.out.println("On average, how much will you pay for each can of beer?");
		double cost = in.nextDouble();

		System.out.printf("That is approximately %.2f beers in one year.\n", consume * 365);

		// Assuming each 12oz of beer is 150 calories and one year is 365 days
		double calories = (consume * 365) * 150;

		System.out.printf("In one year you will consume, approximately %.2f "
				+ "calories from beer alone.\n", calories);

		// One beer everyday leads to 15 pounds of weight per year added.
		System.out.printf("Without diet or exercise you will consume %.2f pounds from drinking that "
				+ "much beer in a year.\n", (consume * 15));

		// Something extra
		System.out.printf("You will have spent approximately $%.2f on beer over the course of a year.", cost * 365);

	}

}