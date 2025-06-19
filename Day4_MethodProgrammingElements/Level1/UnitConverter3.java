package Day4_MethodProgrammingElements.Level1;
import java.util.*;
public class UnitConverter3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in kilometers : ");
		double kilometers = sc.nextDouble();
		System.out.println("Enter distance in miles : ");
		double miles = sc.nextDouble();
		System.out.println("Enter distance in meters : ");
		double meters = sc.nextDouble();
		System.out.println("Enter distance in feet : ");
		double feets = sc.nextDouble();
		
		System.out.println(kilometers + " Km in miles is "+ convertKmToMiles(kilometers));
		System.out.println(miles + " miles in km is "+ convertMilestokm(miles));
		System.out.println(meters + " meters in feets is "+ convertMetersToFeets(meters));
		System.out.println(feets + " feets in meters is "+ convertFeetToMeters(feets));
	}
	public static double convertKmToMiles(double kilometers) {
		return kilometers*0.621371;
	}
	public static double convertMilestokm(double miles) {
		return miles * 1.60934;
	}
	public static double convertMetersToFeets(double meters) {
		return meters * 3.28084;
	}
	public static double convertFeetToMeters(double feets) {
		return feets * 0.3048;
	}
}
