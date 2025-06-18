package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class GreatestFactorOfNumberWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int greatestFactor = 1;
		int counter = number - 1;
		while(counter>=1) {
			if(number % counter == 0) {
				greatestFactor = counter;
				break;
			}
			counter--;
		}
		System.out.println("The greatestFactor is "+ greatestFactor);

	}

}
