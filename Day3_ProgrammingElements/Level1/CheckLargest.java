package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class CheckLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int a = sc.nextInt();
		System.out.println("Enter number2: ");
		int b = sc.nextInt();
		System.out.println("Enter number3: ");
		int c = sc.nextInt();
		 
		if(a > b && a > c) {
			System.out.println("Number1 is largest");
		}
		else if(b > a && b > c){
			System.out.println("Number2 is largest");
		}else {
			System.out.println("Number3 is largest");
		}

	}

	

}
