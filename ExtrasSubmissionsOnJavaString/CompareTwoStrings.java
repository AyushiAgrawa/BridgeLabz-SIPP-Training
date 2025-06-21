package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class CompareTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter another string: ");
		String s2 = sc.nextLine();
		CompareStrings(s1, s2);
	}
    
	public static void CompareStrings(String s1, String s2) {
		  int len1 = s1.length();
	      int len2 = s2.length();
	      int minLen = Math.min(len1, len2);
          for (int i = 0; i < minLen; i++) {
	            char c1 = s1.charAt(i);
	            char c2 = s2.charAt(i);

	            if (c1 < c2) {
	                System.out.println( s1 + " comes before " + s2 + " in lexicographical order");
	                return;
	            } else if (c1 > c2) {
	                System.out.println( s2 + " comes before " + s1 + " in lexicographical order");
	                return;
	            }
	       }
          if (len1 == len2) {
              System.out.println("Both strings are equal");
          } else if (len1 < len2) {
              System.out.println( s1 + " comes before " + s2 + " in lexicographical order");
          } else {
              System.out.println(s2 + " comes before " + s1 + " in lexicographical order");
          }
	}
}
