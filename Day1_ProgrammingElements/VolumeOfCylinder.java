import java.util.Scanner;
public class VolumeOfCylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of cylinder: ");
		double radius = sc.nextDouble();
		System.out.println("Enter the height of cylinder: ");
		double height = sc.nextDouble();
		double volume = (Math.PI) * Math.pow(radius, 2) * height;
		System.out.println("The volume is "+ volume);

	}

}
