package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter another string: ");
		String str2 = sc.nextLine();
		AnagramString(str1, str2);
	}
    
	public static void AnagramString(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		if(str1.length() != str2.length()) {
			System.out.println("This is not anagram");
		}
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("These string are Anagrams ");
		}else {
			System.out.println("These string are not anagrams");
		}
	}
}
