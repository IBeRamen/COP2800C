package classwork04;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many scores? ");
		double []scores = new double[input.nextInt()];

		int count = 0;

		System.out.println("The size is " + scores.length);

		displayArray(scores);
		// Add data to array
		count = randomScores(scores);
		displayArray(scores);
		// Bubble sort low to high
		java.util.Arrays.sort(scores);
		displayArray(scores);

	}

	public static void displayArray(double []a){
		for(int i = 0; i < a.length; i++)
			System.out.println((i+1) + ". value: " + a[i]);

		System.out.print("============================\n");
	}

	public static int randomScores(double []a){
		int result = 0;
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(1 + Math.random() * 100);
		}
		result = a.length;
		return result;
	}

}