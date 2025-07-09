package Day2_ProgrammingElement.Level1;
import java.util.*;

class CarRental{
	private String customerName;
	private String carModel;
	private int rentalDays;
	
	CarRental(String customerName, String carModel, int rentalDays){
         this.customerName = customerName;
         this.carModel = carModel;
         this.rentalDays = rentalDays;
	}
	
	public void totalcost(){
		double Rent = switch(carModel.toLowerCase()) {
		      case "suzuki" -> 1000.0;
		      case "honda" -> 1200.0;
		      case "hyundai" -> 1100.0;
		      case "toyota" -> 1300.0;
		      default -> 900.0; 
		};
		double totalCost = Rent * rentalDays;
	    System.out.println();
		System.out.println("Name: "+customerName);
		System.out.println("Car model: "+carModel);
		System.out.println("Rental days: "+rentalDays);
		System.out.println("Total Cost is "+totalCost);
	}
}
public class CarRentalSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Customer Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Car Model (Suzuki/Honda/Hyundai/Toyota): ");
		String model = sc.nextLine();

		System.out.print("Enter Number of Rental Days: ");
		int days = sc.nextInt();

		CarRental rental = new CarRental(name, model, days);
		rental.totalcost();

	}

}
