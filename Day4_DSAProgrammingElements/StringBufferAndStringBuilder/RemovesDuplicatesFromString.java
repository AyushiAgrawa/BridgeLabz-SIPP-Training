package Day4_DSAProgrammingElements.StringBufferAndStringBuilder;
import java.util.*;
public class RemovesDuplicatesFromString {

	public static void main(String[] args) {
		String s = "DataProgramming";
		System.out.println(s);
		
		String o = removeDuplicates(s);
		System.out.println(o);
		
	}

	static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for(char ch : s.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
