package classwork06;

import java.util.*;

public class Hurricane {
	private String hurricaneName;
	private int category;
	private int maxWindSpeed;
	private double hurricaneSpeed;

	public Hurricane(){

	}

	public Hurricane(String hurricaneName, int category, int maxWindSpeed, double hurricaneSpeed) {
		//super(); <- don't use
		setHurricaneName(hurricaneName);
		setCategory(category);
		setMaxWindSpeed(maxWindSpeed);
		this.hurricaneSpeed = hurricaneSpeed;
	}

	/*public Hurricane(String hurricaneName, int category, int maxWindSpeed) {
		setHurricaneName(this.hurricaneName);
		this.category = category;
		this.maxWindSpeed = maxWindSpeed;
		this.hurricaneSpeed = 12.0;
	}*/

	///////////////////////////////////////////////////////

	public String getHurricaneName() {
		return hurricaneName;
	}

	public void setHurricaneName(String hurricaneName) {
		hurricaneName.toLowerCase();
		hurricaneName.toUpperCase().charAt(0);//Makes first letter capital
		this.hurricaneName = hurricaneName;
	}

	////////////////////////////////////////////////////////

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		Scanner input = new Scanner(System.in);
		while(category < 1 || category > 5){
			System.out.println("Invalid hurricane category, must be 1-5\n");
			System.out.print("Enter hurricane category: ");
			category = input.nextInt();
		}
		this.category = category;
	}

	//////////////////////////////////////////////////////////

	public int getMaxWindSpeed() {
		return maxWindSpeed;
	}

	public void setMaxWindSpeed(int maxWindSpeed) {
		Scanner input = new Scanner(System.in);
		while(maxWindSpeed < 75){
			System.out.println("Invalid entry, must be at least 75\n");
			System.out.print("Enter max wind speed: ");
			maxWindSpeed = input.nextInt();
		}
		this.maxWindSpeed = maxWindSpeed;
	}

	////////////////////////////////////////////////////////////

	public double getHurricaneSpeed() {
		return hurricaneSpeed;
	}

	public void setHurricaneSpeed(double hurricaneSpeed) {
		this.hurricaneSpeed = hurricaneSpeed;
	}

	@Override
	public String toString() {
		return "Hurricane Name: " + hurricaneName + "\nHurrican Category: "
				+ category + "\nMax Wind Speed: " + maxWindSpeed
				+ "\nHurricane Speed: " + hurricaneSpeed + 
				"\n\n========================================\n\n";
	}
	
	public void getValues(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hurricane name: ");
		setHurricaneName(input.nextLine());
		
		System.out.print("Enter hurricane category: ");
		setCategory(input.nextInt());
		
		System.out.print("Enter max wind speed: ");
		setMaxWindSpeed(input.nextInt());

		System.out.print("Enter hurricane speed: ");
		setHurricaneSpeed(input.nextDouble());
	}
	
}
/*
>Source
	>Generate constructor using fields
	>Generate setters and getters
	>Generate toString
*/