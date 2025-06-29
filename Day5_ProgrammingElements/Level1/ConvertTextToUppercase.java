package Day5_ProgrammingElements.Level1;
import java.util.*;
public class ConvertTextToUppercase {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String inputText = sc.nextLine();
        String manualUpper = convertToUpperUsingCharAt(inputText);
        String builtInUpper = inputText.toUpperCase();
        boolean areEqual = compareStringsUsingCharAt(manualUpper, builtInUpper);
        System.out.println("\nManual Uppercase Conversion: " + manualUpper);
        System.out.println("Built-in toUpperCase Result: " + builtInUpper);
        System.out.println("Are both conversions equal? " + areEqual);
	}
	 public static String convertToUpperUsingCharAt(String text) {
	        String result = "";
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                ch = (char) (ch - 32); 
	            }
	            result += ch; 
	        }
	        return result;
	 }
	 public static boolean compareStringsUsingCharAt(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }

	        return true;
	  }
}
