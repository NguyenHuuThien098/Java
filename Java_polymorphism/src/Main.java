import java.util.Iterator;

public class Main{
	public static void main(String[] args) {
		// Polymorphim = 	greek word for poly-"many", morph - "form"
		// 					the ability of an object to indentify á more than one type
		
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat};
		
		for (Vehicle x : racers) {
			x.go();
		}
	}
}