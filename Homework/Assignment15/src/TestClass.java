import javax.swing.JOptionPane;

public class TestClass {
	
	public static void main(String[] args) {
		
		Ferrari car = new Ferrari();
		Boeing777 aircraft = new Boeing777();
		Yacht boat = new Yacht();
		
		// Ferrari
		JOptionPane.showMessageDialog(null, car.carName() + "\n" + car.carType() +
				"\n" + car.transmissionType() + "\n" + car.toString());
		JOptionPane.showMessageDialog(null, "Increasing speed...");
		car.increaseSpeed(70);
		car.decreaseSpeed(10);
		JOptionPane.showMessageDialog(null, car.toString());
		
		// Boeing
		JOptionPane.showMessageDialog(null, aircraft.manufacturer() +  
				"\nAmount of engines: " + aircraft.amtofEngines() + "\n" + aircraft.toString());
		JOptionPane.showMessageDialog(null, "Taking off...");
		aircraft.increaseSpeed(500);
		JOptionPane.showMessageDialog(null, aircraft.toString());
		JOptionPane.showMessageDialog(null, "Landing...");
		aircraft.decreaseSpeed(470);
		JOptionPane.showMessageDialog(null, aircraft.toString());
		
		// Boat
		JOptionPane.showMessageDialog(null, boat.boatName() + "\n" + boat.typeOfBoat() + 
				"\n" + boat.manufacturer() + "\nPrice of boat: " + boat.priceOfBoat());
		JOptionPane.showMessageDialog(null, boat.toString());
		JOptionPane.showMessageDialog(null, "Setting sail!");
		boat.increaseSpeed(20);
		JOptionPane.showMessageDialog(null, boat.toString());
	}

}
