package Day3_ProgrammingElements.Level2;
import java.util.Scanner;
public class FactorsOfNumberForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if(number >=0) {
			for(int i=1; i< number ; i++) {
				if(number % i == 0) {
					System.out.println("Factors are " + i);
				}
			}
		}else {
			System.out.println("Not a positive number");
		}

	}

}
