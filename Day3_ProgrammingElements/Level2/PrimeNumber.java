package Day3_ProgrammingElements.Level2;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            boolean isPrime = true;
        
		    for (int i = 2; i < number; i++) {
                 if (number % i == 0) {
                     isPrime = false; 
                     break;
                  }
             }
		    if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is NOT a Prime Number.");
            }
        }
	}

}
