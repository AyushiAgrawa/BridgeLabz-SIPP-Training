package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class SubstringOccurrences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String string = sc.nextLine();
		System.out.println("Enter Substring: ");
		String substring = sc.nextLine();
		Substring(string, substring);
	}
    
	public static void Substring(String string, String substring) {
		String[] words = string.split("\\s");
		int count = 0;
		for(String word : words) {
			if(word.equals(substring)) {
				count++;
			}
		}
		System.out.println("The number of times this substring occurs : "+count);
	}
}
