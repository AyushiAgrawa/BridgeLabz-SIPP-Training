package Day5_ProgrammingElements.Level1;
import java.util.*;
public class StringIndexOutOfBound {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputText = sc.nextLine();
	        System.out.print("Enter the index to access: ");
	        int index = sc.nextInt();
	        System.out.println("\nCalling generateException() (without try-catch):");
	        try {
	            generateException(inputText, index);
	        } catch (Exception e) {
	            System.out.println("Exception caught in main: " + e);
	        }
	        System.out.println("\nCalling handleException() (with try-catch):");
	        handleException(inputText, index);
	 }       
	 public static void generateException(String text, int index) {
	        System.out.println("Character at index " + index + ": " + text.charAt(index));
	 }
	 public static void handleException(String text, int index) {
	        try {
	            System.out.println("Character at index " + index + ": " + text.charAt(index));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("Caught RuntimeException: " + e.getMessage());
	        }
	 }
}	 
	 