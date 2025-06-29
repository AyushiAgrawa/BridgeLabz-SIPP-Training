package EXTRASBuiltInFunction.Level2;
import java.util.*;
public class GCDandLCMCalculator {
	public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
	public static int[] getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        return new int[] { a, b };
    }
	public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
	public static void main(String[] args) {
        int[] input = getinput();
        int a = input[0];
        int b = input[1];

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b);

        displayResults(a, b, gcd, lcm);
    }
}
