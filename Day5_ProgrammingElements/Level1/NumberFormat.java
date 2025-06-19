package Day5_ProgrammingElements.Level1;
import java.util.*;
public class NumberFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (or any text): ");
        String userInput = sc.nextLine();
        System.out.println("Calling generateException:");
        try {
            generateException(userInput); 
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }
        System.out.println("\nCalling handleException() (with try-catch):");
        handleException(userInput);
	}
	public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Converted number: " + number);
    }
	public static void handleException(String input) {
	        try {
	            int number = Integer.parseInt(input);
	            System.out.println("Converted number: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Caught NumberFormatException: Input is not a valid integer.");
	        } catch (RuntimeException e) {
	            System.out.println("Caught RuntimeException: " + e.getMessage());
	        }
	 }
}
