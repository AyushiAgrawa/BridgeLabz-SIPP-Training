package Day5_ProgrammingElements.Level1;
import java.util.*;
public class TrimString {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string with leading and/or trailing spaces: ");
	        String inputText = sc.nextLine();
	        int[] trimIndices = findTrimIndices(inputText);
	        int start = trimIndices[0];
	        int end = trimIndices[1];
	        String manuallyTrimmed = createSubstringUsingCharAt(inputText, start, end);
	        String builtInTrimmed = inputText.trim();
	        boolean isEqual = compareStringsUsingCharAt(manuallyTrimmed, builtInTrimmed);
	        System.out.println("\nManually Trimmed String: \"" + manuallyTrimmed + "\"");
	        System.out.println("Built-in trim() Result:  \"" + builtInTrimmed + "\"");
	        System.out.println("Are both results equal? " + isEqual);
	}
	public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end}; 
    }
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareStringsUsingCharAt(String s1, String s2) {
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
