package Day2_WorkshopPrograms;
import java.util.*;
class Ride{
	double distance;
	int time;
	String type;
	
	Ride(double distance, int time, String type){
		this.distance = distance;
		this.time= time;
		this.type = type;
	}
}

class Invoice{
	static double calculateFare(double distance, int time, String type) {
		double fare;
		if(type.equalsIgnoreCase("Normal")) {
			fare = 10 * distance + 1*time;
			if(fare<5) {
				fare = 5;
			}
		}else {
			fare = 15 * distance + 2*time;
			if(fare<20) {
				fare = 20;
			}
		}
		return fare;
	}
}

public class CabinvoiceCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rides: ");
		int n = sc.nextInt();
		Ride[] rides = new Ride[n];
		sc.nextLine();
		for(int i=0; i<n; i++) {
			System.out.println("Ride: "+ (i+1));
			
			System.out.println("Enter distance: ");
			double distance = sc.nextDouble();
			
			System.out.println("Enter time: ");
			int time = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter type (Normal or Premium):");
			String type = sc.nextLine();
			
			rides[i] = new Ride(distance, time, type);
			
		}
		
		int totalFare = 0;
		for(Ride r : rides) {
			totalFare += Invoice.calculateFare(r.distance, r.time, r.type);
		}
		
		System.out.println("Total rides: "+ n);
		System.out.println("Total fare: "+ totalFare);
		double average = totalFare/n;
		System.out.println("Average Fare: "+ average);
	}

}
