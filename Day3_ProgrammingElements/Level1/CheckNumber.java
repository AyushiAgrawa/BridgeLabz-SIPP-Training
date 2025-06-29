package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		if(n==0) {
			System.out.println("number is Zero");
		}else if(n>0) {
			System.out.println("number is positive");
		}else {
			System.out.println("number is negative");
		}

	}

}
