package Day4_MethodProgrammingElements.Level2;
import java.util.*;
public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		 int[] factors = factors(number);
		 System.out.print("Factors: ");
	        for (int f : factors) {
	            System.out.print(f + " ");
	        }
	        System.out.println();
	        System.out.println("Sum = " + getSum(factors));
	        System.out.println("Product = " + getProduct(factors));
	        System.out.println("Sum of Squares = " + getSumOfSquares(factors));
	}
	public static int[] factors(int number) {
		int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
	}
	 public static int getSum(int[] arr) {
	        int sum = 0;
	        for (int n : arr) {
	            sum += n;
	        }
	        return sum;
	  }
	 public static long getProduct(int[] arr) {
	        long product = 1;
	        for (int n : arr) {
	            product *= n;
	        }
	        return product;
	 }
	 public static int getSumOfSquares(int[] arr) {
	        int sum = 0;
	        for (int n : arr) {
	            sum += n * n;
	        }
	        return sum;
	    }

	

}
