package classwork02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = scan.nextInt();

		boolean resultEven = num % 2 == 0;

		if (resultEven) {
			System.out.println("The number " + num + " is even.");
		}
		else {
			System.out.println("The number " + num + " is odd.");
		}

	}

}
