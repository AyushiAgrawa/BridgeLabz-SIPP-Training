package Day3_ProgrammingElements;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter operations: ");
		char c = sc.next().charAt(0); 
		switch(c){
			case '+':
				System.out.println(a+b);
				break;
			
			case '-':
				System.out.println(a-b);
			    break;
			
			case '*':
				System.out.println(a*b);
				break;
			
			case '/':
				System.out.println(a/b);
				break;
			
			case '%':
				System.out.println(a%b);
				break;
		     default:
		    	 System.out.println("Invalid operation");
		}
			

	}

}
