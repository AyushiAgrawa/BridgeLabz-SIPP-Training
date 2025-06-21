package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		ReverseString(s);
	}
	
	public static void ReverseString(String s) {
		
			String reversed = new StringBuilder(s).reverse().toString();
			System.out.println("Reversed string of "+ s + " is : "+ reversed);
	}

}
