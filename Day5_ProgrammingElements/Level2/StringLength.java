package Day5_ProgrammingElements.Level2;
import java.util.*;
public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int customLength = findLengthWithoutLengthMethod(input);
        int actualLength = input.length();
        System.out.println("\nLength using custom method: " + customLength);
        System.out.println("Length using built-in method: " + actualLength);
        System.out.println("Are both lengths equal? " + (customLength == actualLength));

	}
	public static int findLengthWithoutLengthMethod(String text) {
	        int count = 0;
	        try {
	            while (true) {
	                text.charAt(count); // Accessing each character
	                count++;
	            }
	        } catch (StringIndexOutOfBoundsException e) {
	        }
	        return count;
	}
}
