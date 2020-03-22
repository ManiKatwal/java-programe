
public class aaaa {
	public static void main(String[] args) {
	
		aircraft jet = new aircraft ();
		aircraft boing = new aircraft ();
		
		double jetEndurance;
		double boingEndurance;
		
		jet.passangerCapacity = 365;
		jet.cruiseSpeesd = 495;
		jet.fuelCapacity = 7894;
		jet.fuelBurnRate = 23.24;
		
		System.out.print("\nJet Passengers: " + jet.passangerCapacity);
		System.out.print("\nJet Cruise Speed: " + jet.cruiseSpeesd + "mph");
		System.out.print("\nJet fuel capacity: " + jet.fuelCapacity + "gal");
		System.out.print("\nJet fuel burning capacity: " + jet.fuelBurnRate + "gph");

		boing.passangerCapacity = 400;
		boing.cruiseSpeesd = 498;
		boing.fuelCapacity = 9987;
		boing.fuelBurnRate = 56.45;
		
		System.out.print("\nBoing passengers: " + boing.passangerCapacity);
		System.out.print("\nBoing speed: " + boing.cruiseSpeesd + "mph");
		System.out.print("\nBoing fuel capicity: " + boing.fuelCapacity + "gal");
		System.out.println("\nBoing fuel burning capacity: " + boing.fuelBurnRate + "gph");
	
		jetEndurance = jet.fuelCapacity/jet.fuelBurnRate;
		boingEndurance = boing.fuelCapacity/boing.fuelBurnRate;
		
	
	
	
	}
}





class aircraft {
	int passangerCapacity;
	int cruiseSpeesd;
	double fuelCapacity;
	double fuelBurnRate;
}