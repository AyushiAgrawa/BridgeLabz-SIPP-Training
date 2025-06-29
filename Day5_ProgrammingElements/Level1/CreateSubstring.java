package Day5_ProgrammingElements.Level1;
import java.util.*;
public class CreateSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String input = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String manualSubstring = createSubstringUsingCharAt(input, start, end);
        String builtInSubstring = "";
        if (start >= 0 && end <= input.length() && start < end) {
            builtInSubstring = input.substring(start, end);
        } else {
            System.out.println("Invalid start or end index for built-in substring().");
        }
        boolean isEqual = compareUsingCharAt(manualSubstring, builtInSubstring);
        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using built-in substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + isEqual);
	}
    public static String createSubstringUsingCharAt(String text, int start, int end) {
	     String result = "";
	     for (int i = start; i < end && i < text.length(); i++) {
	          result += text.charAt(i);
	     }
	     return result;
	 }
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
