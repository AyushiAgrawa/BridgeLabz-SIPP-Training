package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class ToggleCaseOfCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		Toggledstring(s);
		
	}
    
	public static void Toggledstring(String s) {
		StringBuilder newstring = new StringBuilder();
		for(char ch : s.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				newstring.append(Character.toLowerCase(ch));
			}else if(Character.isLowerCase(ch)) {
				newstring.append(Character.toUpperCase(ch));
			}else {
				newstring.append(ch);
			}
		}
		System.out.println("The toggled string is :"+ newstring.toString());
	}
}
