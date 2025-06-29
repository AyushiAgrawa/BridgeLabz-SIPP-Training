package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class PalindromeStringCheck {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		palindrome(s);
	}
	
	public static void palindrome(String s) {
		String reversed = new StringBuilder(s).reverse().toString();
		if(reversed.equals(s)) {
			System.out.println("The string is palindrome.");
		}else {
			System.out.println("The string is not palindrome");
		}
	}

}
