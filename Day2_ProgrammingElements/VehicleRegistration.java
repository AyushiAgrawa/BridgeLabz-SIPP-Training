package Day2_ProgrammingElement.Level1;
import java.util.*;
class Vehicle{
	private String ownerName;
	private String vehicleType;
	static double registrationFee = 4000.0;
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName; 
		this.vehicleType = vehicleType;
	}
	
	void displayVehicleDetails(){
		System.out.println();
		System.out.println("The name of owner is : "+ ownerName);
		System.out.println("The vehicle Type is : "+ vehicleType);
		
	}
	
	static void updateRegistrationFee(double newRegistrationFee) {
		registrationFee = newRegistrationFee;
	}
	
	static void displayRegistrationFee() {
		System.out.println("The new registration fee  is : "+registrationFee);
	}
	
}
public class VehicleRegistration {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Raj", "Bike");
		Vehicle v2 = new Vehicle("Shyam", "Car");
		Vehicle v3 = new Vehicle("Ram", "Bicycle");
		Vehicle v4 = new Vehicle("Preeti", "Car");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();
        v4.displayVehicleDetails();
        
        
        System.out.println();
        Vehicle.updateRegistrationFee(5000.0);
        Vehicle.displayRegistrationFee();
	}

}
