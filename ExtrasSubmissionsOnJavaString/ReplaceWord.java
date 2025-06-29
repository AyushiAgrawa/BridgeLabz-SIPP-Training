package ExtrasSubmissionsOnJavaString;
import java.util.*;
public class ReplaceWord {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String sentence = sc.nextLine();
	        System.out.println("Enter the word to replace:");
	        String oldWord = sc.next();
	        System.out.println("Enter the new word:");
	        String newWord = sc.next();
	        replacewordinsentence(sentence, oldWord, newWord);
	}
   
	public static void replacewordinsentence(String sentence, String oldWord, String newWord) {
		String newsentence = sentence.replaceAll(oldWord, newWord);
		System.out.println("The new Sentence is " +newsentence);
	}
}
