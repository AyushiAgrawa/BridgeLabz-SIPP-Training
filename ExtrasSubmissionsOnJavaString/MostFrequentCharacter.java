package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class MostFrequentCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		FrequentCharacter(s);
	}
	
	public static void FrequentCharacter(String s) {
	    int[] frequent = new int[256];
		for (char ch : s.toCharArray()) {
			frequent[ch]++;
		 }
		 char mostFrequent = ' ';
	     int maxcharacter = 0;
	     for(char ch:s.toCharArray()) {
	    	 if(frequent[ch] > maxcharacter) {
	    		 maxcharacter=frequent[ch];
	    		 mostFrequent = ch;
	    	 }
	     }
	     System.out.println("Most Freequent charcter is "+ mostFrequent);
	}
}
