package Day4_MethodProgrammingElements.Level1;
import java.util.Scanner;
public class TrignometricFunctionsUsingMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a angle (in degrees):");
		double angle = sc.nextDouble();
		double[] trigvalues = calculateTrignometricFunctions(angle);
			System.out.println("Sine: " + trigvalues[0]);
			System.out.println("Cosine: " + trigvalues[1]);
			System.out.println("Tangent: " + trigvalues[2]);
			sc.close();
	}
	public static double[] calculateTrignometricFunctions(double angle) {
		 double radians = Math.toRadians(angle);
	        double[] result = new double[3];
	        result[0] = Math.sin(radians);
	        result[1] = Math.cos(radians);
	        result[2] = Math.tan(radians);
	        return result;
	}

}
