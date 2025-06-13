import java.util.Scanner;
public class PowerCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		double base = sc.nextDouble();
		System.out.println("Enter exponent: ");
		double exponent = sc.nextDouble();
		
		double power = Math.pow(base, exponent);
		System.out.println(base + " raised to the power of " + exponent + " is " + power);

	}

}
