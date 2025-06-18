package Day3_ProgrammingElements.Level2;
import java.util.Scanner;
public class PowerOfNumberWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("Enter power: ");
		int power = sc.nextInt();
		int result = 1;
		int counter = 0;
		while(counter < power) {
			result = result * number;
			counter++;
		}	
		System.out.println("The power "+ power+" of number "+ number +" is "+ result);
		
	}

}
