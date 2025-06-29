package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class RemoveDuplicatesFromAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		RemoveDuplicates(s);
	}
    
	public static void RemoveDuplicates(String s) {
		String newstring = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(newstring.indexOf(ch) == -1) {
				newstring += ch;
			}
		}
		System.out.println("New String after removing duplicates : "+ newstring);
	}
}
