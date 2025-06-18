package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class SumOfNumbersUntil0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		System.out.println("Enter numbers : ");
		double n = sc.nextDouble();
		  while (n != 0) {
	           sum += n; // Add the number to total
	            System.out.println("Enter another number (0 to stop):");
	            n = sc.nextDouble();
		  }     
		  System.out.println("The total sum is: " + sum);
	}

}
