package homework01;

import java.util.Scanner;

/**
 *
 * @author Omar Rahman
 * @date Sep 3, 2017
 *
 */

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Another way to print the sum or product
		 * without creating a new var would be:
		 * System.out.println("The sum: " + (num1 * num2));
		 */
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter number one:");
		int num1 = scan.nextInt();
		
		System.out.println("Enter number two:");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum: " + sum);
		
		int product = num1 * num2;
		
		System.out.println("The product: " + product);
		
	}

}
