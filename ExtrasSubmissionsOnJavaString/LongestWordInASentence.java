package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class LongestWordInASentence {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a string: ");
	     String s = sc.nextLine();
	     LongestWord(s);
	}
	
	public static void LongestWord(String s) {
		String[] words = s.split("\\s");
		String LongestWord = "";
		int maxlength = 0;
		for(String word : words ) {
			if(word.length() > maxlength) {
				LongestWord = word;
				maxlength = word.length();
			}
		}
		System.out.println("The longest word is "+ LongestWord);
	}

}
