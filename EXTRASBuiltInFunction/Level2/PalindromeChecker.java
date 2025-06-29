package EXTRASBuiltInFunction.Level2;
import java.util.*;
public class PalindromeChecker {
	public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String s = sc.nextLine();
        return s;
    }
	public static boolean Palindrome(String s) {
		String reversed = new StringBuilder(s).reverse().toString();
		return reversed.equalsIgnoreCase(s); 
	}
	public static void displayResult(String s, boolean result) {
        if (result) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
	public static void main(String[] args) {
	        String input = getInput();
	        boolean isPalindrome = Palindrome(input);
	        displayResult(input, isPalindrome);
	}
}
