package Day5_ProgrammingElements.Level1;
import java.util.*;
public class CompareStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
	    String first = sc.next();
	    System.out.print("Enter second string: ");
	    String second = sc.next();
	    boolean result = compare(first, second);
        boolean resultEquals = first.equals(second);
        if (result == resultEquals) {
            System.out.println(" Both methods give the same result.");
        } else {
            System.out.println(" The results from charAt() and equals() are different.");
        }
	}
	public static boolean compare(String s1, String s2) {
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
