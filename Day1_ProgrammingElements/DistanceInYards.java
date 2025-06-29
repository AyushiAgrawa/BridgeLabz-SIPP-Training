import java.util.Scanner;
public class DistanceInYards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in feet:");
		double distanceinfeet = sc.nextDouble();
		double distanceinyards = distanceinfeet / 3;
		double distanceinmiles = distanceinyards/1760;
		System.out.println("The distance in yards is "+ distanceinyards+" while the distance in miles is "+distanceinmiles);
	}

}
