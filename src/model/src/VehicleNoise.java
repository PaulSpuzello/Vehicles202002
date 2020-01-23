import model.*;

public class VehicleNoise {
	//add your new vehicle class to the model package
	//only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		Boat baglietto = new Boat();
		System.out.println(baglietto.makeNoise());
    
    		Camper jayco = new Camper();
		System.out.println(jayco.makeNoise());
		
		Van genericVan = new Van();
		System.out.println(genericVan.makeNoise());
		
		Truck someToyota = new Truck("Tacoma", 2016, "4WD");
		System.out.println(someToyota.makeNoise());
	}

}
