package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class RemoveSpecificCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter a character to remove: ");
		char character = sc.next().charAt(0);
		SpecificCharacter(s, character);
	}
    
	public static void SpecificCharacter(String s, char character) {
		StringBuilder modifiedstring = new StringBuilder();
		for (char ch : s.toCharArray()) {
	            if (ch != character) {
	                modifiedstring.append(ch); 
	            }
	    }
	    System.out.println("The modified string is "+ modifiedstring.toString());
	}
}
