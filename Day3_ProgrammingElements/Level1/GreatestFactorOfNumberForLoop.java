package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class GreatestFactorOfNumberForLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int greatestFactor = 1;
		for(int i= n-1; i>=1; i--) {
			if(n % i == 0) {
				greatestFactor = i;
				break;
			}
			
		}
		System.out.println("The greatestFactor is "+ greatestFactor);
	}

}
