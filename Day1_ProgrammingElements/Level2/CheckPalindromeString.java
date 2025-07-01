package Day1_ProgrammingElements.Level2;
import java.util.*;
class PalindromeChecker{
	private String text;
	
	public PalindromeChecker(String Text){
		this.text = Text;
	}
	
	public boolean Palindrome(){
		int left = 0;
		int right = text.length()-1;
		while(left < right) {
			if(text.charAt(left) != text.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	
	public void displayresults() {
		System.out.println();
		System.out.println("The text is "+ text);
		if(Palindrome()) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
	}
}
public class CheckPalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		PalindromeChecker obj = new PalindromeChecker(text);
		obj.displayresults();
        sc.close();
	}

}
