package Day5_ProgrammingElements.Level2;
import java.util.*;
public class VowelsAndConsonatsinText {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        String[][] analysis = analyzeCharacters(input);
	        System.out.println("\n--- Character Type Analysis ---");
	        displayCharacterAnalysis(analysis);
	}
	public static String getCharacterType(char ch) {
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
	public static String[][] analyzeCharacters(String input) {
        String[][] result = new String[input.length()][2];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharacterType(ch);
        }

        return result;
    }
	 public static void displayCharacterAnalysis(String[][] data) {
	        System.out.printf("%-10s %-15s\n", "Character", "Type");
	        System.out.println("---------------------------");
	        for (String[] row : data) {
	            System.out.printf("%-10s %-15s\n", row[0], row[1]);
	        }
	    }
}
