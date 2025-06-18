package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class PowerOFNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		System.out.println("Enter power: ");
		int power = sc.nextInt();
		int result = 1;
		for(int i=1; i<=power; i++) {
			result = result * number;
			
		}
		System.out.println("The power "+ power +" of number "+ number+ " is " +result);
		
	}

}
