package Day5_ProgrammingElements.Level2;
import java.util.*;
public class VowelsAndConsonants {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputText = sc.nextLine();
	        int[] counts = countVowelsAndConsonants(inputText);
	        System.out.println("\nTotal Vowels: " + counts[0]);
	        System.out.println("Total Consonants: " + counts[1]);

	}
	public static String checkCharacterType(char ch) {
	        if (ch >= 'A' && ch <= 'Z') {
	            ch = (char)(ch + 32); 
	        }
	        if (ch >= 'a' && ch <= 'z') {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                return "Vowel";
	            } else {
	                return "Consonant";
	            }
	        } else {
	            return "Not a Letter";
	        }
	  }
	  public static int[] countVowelsAndConsonants(String text) {
	        int vowelCount = 0;
	        int consonantCount = 0;
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            String result = checkCharacterType(ch);

	            if (result.equals("Vowel")) {
	                vowelCount++;
	            } else if (result.equals("Consonant")) {
	                consonantCount++;
	            }
	        }
	        return new int[]{vowelCount, consonantCount};
	    }
}
