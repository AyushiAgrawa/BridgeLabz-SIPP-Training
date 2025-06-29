package Day4_MethodProgrammingElements.Level1;
import java.util.Scanner;
public class UnitConverter2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in yards: ");
		double yards = sc.nextDouble();
		System.out.println("Enter length in feet: ");
		double feets = sc.nextDouble();
		System.out.println("Enter length in meters: ");
		double meters = sc.nextDouble();
		System.out.println("Enter length in inches: ");
		double inches = sc.nextDouble();
		
		System.out.println(yards + " yards to feet is "+ convertYardsToFeet(yards));
		System.out.println(feets + " feets to yards is "+ convertFeetToYards(feets));
		System.out.println(meters + " meters to inches is "+ convertMetersToInches(meters));
		System.out.println(inches + " inches to meters is "+ convertInchesToMeters(inches));
		System.out.println(inches + " inches to centimeters is "+ convertInchesToCentiMeters(inches));
	}
	public static double convertYardsToFeet(double yards) {
		return yards * 3;
	}
	public static double convertFeetToYards(double feets) {
		return feets * 0.333333;
	}
	public static double convertMetersToInches(double meters) {
		return meters * 39.3701;
	}
	public static double convertInchesToMeters(double inches) {
		return inches* 0.0254;
	}
	public static double convertInchesToCentiMeters(double inches) {
		return inches* 2.54;
	}
}
